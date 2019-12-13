package io.github.hidroh.hackernews.showhn;


import androidx.annotation.NonNull;

import io.github.hidroh.hackernews.BaseStoriesActivity;
import io.github.hidroh.hackernews.data.ItemManager;

public class ShowActivity extends BaseStoriesActivity {

    @Override
    protected String getDefaultTitle() {
        return getString(io.github.hidroh.hackernews.R.string.title_activity_show);
    }

    @NonNull
    @Override
    protected String getFetchMode() {
        return ItemManager.SHOW_FETCH_MODE;
    }
}
