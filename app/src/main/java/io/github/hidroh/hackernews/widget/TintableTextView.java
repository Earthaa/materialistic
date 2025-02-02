/*
 * Copyright (c) 2015 Ha Duy Trung
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.hidroh.hackernews.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.appcompat.widget.AppCompatTextView;
import android.util.AttributeSet;

import io.github.hidroh.hackernews.AppUtils;
import io.github.hidroh.hackernews.R;

public class TintableTextView extends AppCompatTextView {

    private int mTextColor;

    public TintableTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TintableTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mTextColor = getTextColor(context, attrs);
        TypedArray ta = context.getTheme().obtainStyledAttributes(attrs,
                R.styleable.TintableTextView, 0, 0);
        setCompoundDrawablesWithIntrinsicBounds(
                ta.getDrawable(R.styleable.TintableTextView_iconStart),
                ta.getDrawable(R.styleable.TintableTextView_iconTop),
                ta.getDrawable(R.styleable.TintableTextView_iconEnd),
                ta.getDrawable(R.styleable.TintableTextView_iconBottom));
        ta.recycle();
    }

    @Override
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        super.setCompoundDrawablesWithIntrinsicBounds(tint(left), tint(top), tint(right), tint(bottom));
    }

    @Override
    public void setTextColor(int color) {
        mTextColor = color;
        super.setTextColor(color);
        Drawable[] drawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(drawables[0], drawables[1], drawables[2], drawables[3]);
    }

    private int getTextColor(Context context, AttributeSet attrs) {
        int defaultTextColor = ContextCompat.getColor(getContext(),
                AppUtils.getThemedResId(getContext(), android.R.attr.textColorTertiary));
        TypedArray ta = context.obtainStyledAttributes(attrs,
                new int[]{android.R.attr.textAppearance, android.R.attr.textColor});
        int ap = ta.getResourceId(0, 0);
        int textColor;
        if (ap == 0) {
            textColor = ta.getColor(1, defaultTextColor);
        } else {
            TypedArray tap = context.obtainStyledAttributes(ap, new int[]{android.R.attr.textColor});
            textColor = tap.getColor(0, defaultTextColor);
            tap.recycle();
        }
        ta.recycle();
        return textColor;
    }

    private Drawable tint(@Nullable Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        drawable = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawable, mTextColor);
        return drawable;
    }
}
