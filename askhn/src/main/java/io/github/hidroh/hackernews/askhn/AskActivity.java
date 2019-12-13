package io.github.hidroh.hackernews.askhn;

import androidx.annotation.NonNull;

import io.github.hidroh.hackernews.BaseStoriesActivity;
import io.github.hidroh.hackernews.data.ItemManager;

public class AskActivity extends BaseStoriesActivity {

    @Override
    protected String getDefaultTitle() {
        return getString(io.github.hidroh.hackernews.R.string.title_activity_ask);
    }

    @NonNull
    @Override
    protected @ItemManager.FetchMode String getFetchMode() {
        return ItemManager.ASK_FETCH_MODE;
    }

}
