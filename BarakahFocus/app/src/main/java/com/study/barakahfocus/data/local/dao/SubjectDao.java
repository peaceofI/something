package com.study.barakahfocus.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.study.barakahfocus.data.local.entities.Subject;
import java.util.List;

@Dao
public interface SubjectDao {
    @Insert
    void insert(Subject subject);

    @Query("SELECT * FROM subject")
    List<Subject> getAll();

    @Query("DELETE FROM subject WHERE id = :id")
    void deleteById(int id);
}
