package com.study.barakahfocus.data.repositories;

import android.app.Application;
import com.study.barakahfocus.BarakahFocusApp;
import com.study.barakahfocus.data.local.AppDatabase;
import com.study.barakahfocus.data.local.dao.AppUsageDao;
import com.study.barakahfocus.data.local.entities.AppUsage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppUsageRepository {
    private AppUsageDao dao;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public AppUsageRepository(Application application) {
        AppDatabase db = ((BarakahFocusApp) application).getDatabase();
        dao = db.appusageDao();
    }

    public void insert(AppUsage appusage) {
        executor.execute(() -> dao.insert(appusage));
    }

    // Add other methods as needed
}
