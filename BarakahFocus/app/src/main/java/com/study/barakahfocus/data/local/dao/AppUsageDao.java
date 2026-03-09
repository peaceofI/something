package com.study.barakahfocus.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.study.barakahfocus.data.local.entities.AppUsage;
import java.util.List;

@Dao
public interface AppUsageDao {
    @Insert
    void insert(AppUsage appusage);

    @Query("SELECT * FROM appusage")
    List<AppUsage> getAll();

    @Query("DELETE FROM appusage WHERE id = :id")
    void deleteById(int id);
}
