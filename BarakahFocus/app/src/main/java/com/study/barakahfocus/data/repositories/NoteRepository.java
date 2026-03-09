package com.study.barakahfocus.data.repositories;

import android.app.Application;
import com.study.barakahfocus.BarakahFocusApp;
import com.study.barakahfocus.data.local.AppDatabase;
import com.study.barakahfocus.data.local.dao.NoteDao;
import com.study.barakahfocus.data.local.entities.Note;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NoteRepository {
    private NoteDao dao;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public NoteRepository(Application application) {
        AppDatabase db = ((BarakahFocusApp) application).getDatabase();
        dao = db.noteDao();
    }

    public void insert(Note note) {
        executor.execute(() -> dao.insert(note));
    }

    // Add other methods as needed
}
