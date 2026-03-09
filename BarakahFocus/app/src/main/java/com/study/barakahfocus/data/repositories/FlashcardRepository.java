package com.study.barakahfocus.data.repositories;

import android.app.Application;
import com.study.barakahfocus.BarakahFocusApp;
import com.study.barakahfocus.data.local.AppDatabase;
import com.study.barakahfocus.data.local.dao.FlashcardDao;
import com.study.barakahfocus.data.local.entities.Flashcard;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FlashcardRepository {
    private FlashcardDao dao;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public FlashcardRepository(Application application) {
        AppDatabase db = ((BarakahFocusApp) application).getDatabase();
        dao = db.flashcardDao();
    }

    public void insert(Flashcard flashcard) {
        executor.execute(() -> dao.insert(flashcard));
    }

    // Add other methods as needed
}
