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

package io.github.hidroh.materialistic.module;

import android.os.Bundle;

import androidx.annotation.NonNull;


import javax.inject.Inject;

import io.github.hidroh.materialistic.ActionViewResolver;
import io.github.hidroh.materialistic.ActivityModule;
import io.github.hidroh.materialistic.BaseStoriesActivity;
import io.github.hidroh.materialistic.CustomTabsDelegate;
import io.github.hidroh.materialistic.Injectable;
import io.github.hidroh.materialistic.KeyDelegate;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.SessionManager;
import io.github.hidroh.materialistic.widget.PopupMenu;

public class JobsActivity extends BaseStoriesActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
//        this.mActionViewResolver = new ActionViewResolver();
//        this.mPopupMenu = new PopupMenu.Impl();
//        this.mCustomTabsDelegate = new CustomTabsDelegate();
//        this.mKeyDelegate = new KeyDelegate();

        super.onCreate(savedInstanceState);

    }
    @Override
    protected String getDefaultTitle() {
        return "Jobs";
    }

    @NonNull
    @Override
    protected String getFetchMode() {
        return ItemManager.JOBS_FETCH_MODE;
    }

}
