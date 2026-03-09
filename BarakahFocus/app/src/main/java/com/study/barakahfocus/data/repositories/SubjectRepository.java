package com.study.barakahfocus.data.repositories;

import android.app.Application;
import com.study.barakahfocus.BarakahFocusApp;
import com.study.barakahfocus.data.local.AppDatabase;
import com.study.barakahfocus.data.local.dao.SubjectDao;
import com.study.barakahfocus.data.local.entities.Subject;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SubjectRepository {
    private SubjectDao dao;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public SubjectRepository(Application application) {
        AppDatabase db = ((BarakahFocusApp) application).getDatabase();
        dao = db.subjectDao();
    }

    public void insert(Subject subject) {
        executor.execute(() -> dao.insert(subject));
    }

    // Add other methods as needed
}
