package io.github.hidroh.hackernews.test;

import androidx.appcompat.view.ActionMode;

import io.github.hidroh.hackernews.FavoriteActivity;

public class TestFavoriteActivity extends FavoriteActivity {
    public ActionMode.Callback actionModeCallback;

    @Override
    public ActionMode startSupportActionMode(ActionMode.Callback callback) {
        actionModeCallback = callback;
        return super.startSupportActionMode(callback);
    }
}
