package io.github.hidroh.hackernews.test;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import io.github.hidroh.hackernews.InjectableActivity;
import io.github.hidroh.hackernews.R;

public class TestReadabilityActivity extends InjectableActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }
}
