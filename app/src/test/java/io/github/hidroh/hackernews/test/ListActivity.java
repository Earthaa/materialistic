package io.github.hidroh.hackernews.test;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import io.github.hidroh.hackernews.InjectableActivity;
import io.github.hidroh.hackernews.MultiPaneListener;
import io.github.hidroh.hackernews.R;
import io.github.hidroh.hackernews.data.WebItem;

import static org.mockito.Mockito.mock;

public class ListActivity extends InjectableActivity implements MultiPaneListener {
    public MultiPaneListener multiPaneListener = mock(MultiPaneListener.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }

    @Override
    public void onItemSelected(WebItem story) {
        multiPaneListener.onItemSelected(story);
    }

    @Override
    public WebItem getSelectedItem() {
        return multiPaneListener.getSelectedItem();
    }

    @Override
    public boolean isMultiPane() {
        return getResources().getBoolean(R.bool.multi_pane);
    }
}
