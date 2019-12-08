package io.github.hidroh.materialistic.askhn;

import androidx.annotation.NonNull;

import io.github.hidroh.materialistic.BaseStoriesActivity;
import io.github.hidroh.materialistic.data.ItemManager;

public class AskActivity extends BaseStoriesActivity {

    @Override
    protected String getDefaultTitle() {
        return getString(io.github.hidroh.materialistic.R.string.title_activity_ask);
    }

    @NonNull
    @Override
    protected @ItemManager.FetchMode String getFetchMode() {
        return ItemManager.ASK_FETCH_MODE;
    }

}
