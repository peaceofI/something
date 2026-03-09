package com.study.barakahfocus.data.local.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "flashcard")
public class Flashcard {
    @PrimaryKey(autoGenerate = true)
    int id; String question; String answer; String subject; int difficulty; long nextReviewDate;
}
