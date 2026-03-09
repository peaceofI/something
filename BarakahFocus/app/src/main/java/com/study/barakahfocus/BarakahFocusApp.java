package com.study.barakahfocus;

import android.app.Application;
import androidx.room.Room;
import com.study.barakahfocus.data.local.AppDatabase;

public class BarakahFocusApp extends Application {
    private static BarakahFocusApp instance;
    private AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        database = Room.databaseBuilder(this, AppDatabase.class, "barakah-db")
                .fallbackToDestructiveMigration()
                .build();
    }

    public static BarakahFocusApp getInstance() {
        return instance;
    }

    public AppDatabase getDatabase() {
        return database;
    }
}
