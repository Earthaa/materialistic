package io.github.hidroh.hackernews.test;

import androidx.room.Room;
import android.content.Context;

import io.github.hidroh.hackernews.data.MaterialisticDatabase;

public abstract class InMemoryDatabase extends MaterialisticDatabase {

    private static MaterialisticDatabase sInstance;

    public static synchronized MaterialisticDatabase getInstance(Context context) {
        if (sInstance == null) {
            sInstance = setupBuilder(Room.inMemoryDatabaseBuilder(context.getApplicationContext(),
                    MaterialisticDatabase.class))
                    .allowMainThreadQueries()
                    .build();
        }
        return sInstance;
    }

    public static synchronized void reset() {
        sInstance = null;
    }
}
