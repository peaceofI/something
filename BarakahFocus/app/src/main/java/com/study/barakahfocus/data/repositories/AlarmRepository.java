package com.study.barakahfocus.data.repositories;

import android.app.Application;
import com.study.barakahfocus.BarakahFocusApp;
import com.study.barakahfocus.data.local.AppDatabase;
import com.study.barakahfocus.data.local.dao.AlarmDao;
import com.study.barakahfocus.data.local.entities.Alarm;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AlarmRepository {
    private AlarmDao dao;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public AlarmRepository(Application application) {
        AppDatabase db = ((BarakahFocusApp) application).getDatabase();
        dao = db.alarmDao();
    }

    public void insert(Alarm alarm) {
        executor.execute(() -> dao.insert(alarm));
    }

    // Add other methods as needed
}
