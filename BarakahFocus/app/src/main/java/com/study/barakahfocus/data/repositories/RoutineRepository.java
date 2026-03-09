package com.study.barakahfocus.data.repositories;

import android.app.Application;
import com.study.barakahfocus.BarakahFocusApp;
import com.study.barakahfocus.data.local.AppDatabase;
import com.study.barakahfocus.data.local.dao.RoutineDao;
import com.study.barakahfocus.data.local.entities.Routine;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RoutineRepository {
    private RoutineDao dao;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public RoutineRepository(Application application) {
        AppDatabase db = ((BarakahFocusApp) application).getDatabase();
        dao = db.routineDao();
    }

    public void insert(Routine routine) {
        executor.execute(() -> dao.insert(routine));
    }

    // Add other methods as needed
}
