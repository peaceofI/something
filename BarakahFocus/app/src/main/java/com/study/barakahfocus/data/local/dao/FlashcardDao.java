package com.study.barakahfocus.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.study.barakahfocus.data.local.entities.Flashcard;
import java.util.List;

@Dao
public interface FlashcardDao {
    @Insert
    void insert(Flashcard flashcard);

    @Query("SELECT * FROM flashcard")
    List<Flashcard> getAll();

    @Query("DELETE FROM flashcard WHERE id = :id")
    void deleteById(int id);
}
