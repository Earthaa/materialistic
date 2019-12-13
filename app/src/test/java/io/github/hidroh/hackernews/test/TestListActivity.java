package io.github.hidroh.hackernews.test;

import android.view.Menu;

import static org.robolectric.Shadows.shadowOf;

public class TestListActivity extends io.github.hidroh.hackernews.ListActivity {
    @Override
    public void supportInvalidateOptionsMenu() {
        Menu optionsMenu = shadowOf(this).getOptionsMenu();
        if (optionsMenu != null) {
            onCreateOptionsMenu(optionsMenu);
            onPrepareOptionsMenu(optionsMenu);
        }
    }
}
