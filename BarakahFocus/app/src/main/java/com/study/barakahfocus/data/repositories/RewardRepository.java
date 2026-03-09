package com.study.barakahfocus.data.repositories;

import android.app.Application;
import com.study.barakahfocus.BarakahFocusApp;
import com.study.barakahfocus.data.local.AppDatabase;
import com.study.barakahfocus.data.local.dao.RewardDao;
import com.study.barakahfocus.data.local.entities.Reward;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RewardRepository {
    private RewardDao dao;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public RewardRepository(Application application) {
        AppDatabase db = ((BarakahFocusApp) application).getDatabase();
        dao = db.rewardDao();
    }

    public void insert(Reward reward) {
        executor.execute(() -> dao.insert(reward));
    }

    // Add other methods as needed
}
