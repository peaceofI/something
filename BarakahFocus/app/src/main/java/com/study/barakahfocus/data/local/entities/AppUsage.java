package com.study.barakahfocus.data.local.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "appusage")
public class AppUsage {
    @PrimaryKey(autoGenerate = true)
    int id; String packageName; long totalTime; long lastUsed;
}
