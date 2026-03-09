package com.study.barakahfocus.data.repositories;

import android.app.Application;
import com.study.barakahfocus.BarakahFocusApp;
import com.study.barakahfocus.data.local.AppDatabase;
import com.study.barakahfocus.data.local.dao.PrayerTimeDao;
import com.study.barakahfocus.data.local.entities.PrayerTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrayerTimeRepository {
    private PrayerTimeDao dao;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public PrayerTimeRepository(Application application) {
        AppDatabase db = ((BarakahFocusApp) application).getDatabase();
        dao = db.prayertimeDao();
    }

    public void insert(PrayerTime prayertime) {
        executor.execute(() -> dao.insert(prayertime));
    }

    // Add other methods as needed
}
