package com.study.barakahfocus.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.study.barakahfocus.data.local.entities.PrayerTime;
import java.util.List;

@Dao
public interface PrayerTimeDao {
    @Insert
    void insert(PrayerTime prayertime);

    @Query("SELECT * FROM prayertime")
    List<PrayerTime> getAll();

    @Query("DELETE FROM prayertime WHERE id = :id")
    void deleteById(int id);
}
