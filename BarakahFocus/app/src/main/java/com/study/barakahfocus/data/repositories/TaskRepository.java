package com.study.barakahfocus.data.repositories;

import android.app.Application;
import com.study.barakahfocus.BarakahFocusApp;
import com.study.barakahfocus.data.local.AppDatabase;
import com.study.barakahfocus.data.local.dao.TaskDao;
import com.study.barakahfocus.data.local.entities.Task;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskRepository {
    private TaskDao dao;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public TaskRepository(Application application) {
        AppDatabase db = ((BarakahFocusApp) application).getDatabase();
        dao = db.taskDao();
    }

    public void insert(Task task) {
        executor.execute(() -> dao.insert(task));
    }

    // Add other methods as needed
}
