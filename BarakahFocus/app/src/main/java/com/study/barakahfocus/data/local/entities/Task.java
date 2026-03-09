package com.study.barakahfocus.data.local.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "task")
public class Task {
    @PrimaryKey(autoGenerate = true)
    int id; String title; String subject; long deadline; int priority; int estimatedTime; boolean completed;
}
