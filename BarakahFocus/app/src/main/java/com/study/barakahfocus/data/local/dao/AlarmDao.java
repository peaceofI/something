package com.study.barakahfocus.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.study.barakahfocus.data.local.entities.Alarm;
import java.util.List;

@Dao
public interface AlarmDao {
    @Insert
    void insert(Alarm alarm);

    @Query("SELECT * FROM alarm")
    List<Alarm> getAll();

    @Query("DELETE FROM alarm WHERE id = :id")
    void deleteById(int id);
}
