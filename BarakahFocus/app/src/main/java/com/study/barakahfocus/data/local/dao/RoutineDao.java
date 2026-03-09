package com.study.barakahfocus.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.study.barakahfocus.data.local.entities.Routine;
import java.util.List;

@Dao
public interface RoutineDao {
    @Insert
    void insert(Routine routine);

    @Query("SELECT * FROM routine")
    List<Routine> getAll();

    @Query("DELETE FROM routine WHERE id = :id")
    void deleteById(int id);
}
