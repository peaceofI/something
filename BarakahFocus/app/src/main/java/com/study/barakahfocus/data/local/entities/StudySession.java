package com.study.barakahfocus.data.local.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "studysession")
public class StudySession {
    @PrimaryKey(autoGenerate = true)
    int id; String subject; long startTime; long endTime; int duration;
}
