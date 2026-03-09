package com.study.barakahfocus.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.study.barakahfocus.data.local.entities.Note;
import java.util.List;

@Dao
public interface NoteDao {
    @Insert
    void insert(Note note);

    @Query("SELECT * FROM note")
    List<Note> getAll();

    @Query("DELETE FROM note WHERE id = :id")
    void deleteById(int id);
}
