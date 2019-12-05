package io.github.hidroh.materialistic.showhn;


import androidx.annotation.NonNull;

import io.github.hidroh.materialistic.BaseStoriesActivity;
import io.github.hidroh.materialistic.data.ItemManager;

public class ShowActivity extends BaseStoriesActivity {

    @Override
    protected String getDefaultTitle() {
        return getString(io.github.hidroh.materialistic.R.string.title_activity_show);
    }

    @NonNull
    @Override
    protected String getFetchMode() {
        return ItemManager.SHOW_FETCH_MODE;
    }
}
