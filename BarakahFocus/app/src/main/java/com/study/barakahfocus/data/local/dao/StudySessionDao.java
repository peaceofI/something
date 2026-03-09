package com.study.barakahfocus.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.study.barakahfocus.data.local.entities.StudySession;
import java.util.List;

@Dao
public interface StudySessionDao {
    @Insert
    void insert(StudySession studysession);

    @Query("SELECT * FROM studysession")
    List<StudySession> getAll();

    @Query("DELETE FROM studysession WHERE id = :id")
    void deleteById(int id);
}
