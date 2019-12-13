package io.github.hidroh.hackernews.test;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import io.github.hidroh.hackernews.InjectableActivity;
import io.github.hidroh.hackernews.R;
import io.github.hidroh.hackernews.WebFragment;
import io.github.hidroh.hackernews.data.WebItem;

public class WebActivity extends InjectableActivity {
    public static final String EXTRA_ITEM = WebActivity.class.getName() + ".EXTRA_ITEM";
    public WebFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            WebItem item = getIntent().getParcelableExtra(EXTRA_ITEM);
            Bundle args = new Bundle();
            args.putParcelable(WebFragment.EXTRA_ITEM, item);
            fragment = (WebFragment) Fragment.instantiate(this, WebFragment.class.getName(), args);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content,
                            fragment,
                            WebFragment.class.getName())
                    .commit();
        } else {
            fragment = (WebFragment) getSupportFragmentManager().findFragmentByTag(WebFragment.class.getName());
        }
    }
}
