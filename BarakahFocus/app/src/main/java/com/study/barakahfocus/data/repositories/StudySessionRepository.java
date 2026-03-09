package com.study.barakahfocus.data.repositories;

import android.app.Application;
import com.study.barakahfocus.BarakahFocusApp;
import com.study.barakahfocus.data.local.AppDatabase;
import com.study.barakahfocus.data.local.dao.StudySessionDao;
import com.study.barakahfocus.data.local.entities.StudySession;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudySessionRepository {
    private StudySessionDao dao;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public StudySessionRepository(Application application) {
        AppDatabase db = ((BarakahFocusApp) application).getDatabase();
        dao = db.studysessionDao();
    }

    public void insert(StudySession studysession) {
        executor.execute(() -> dao.insert(studysession));
    }

    // Add other methods as needed
}
