package com.study.barakahfocus.data.local.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "routine")
public class Routine {
    @PrimaryKey(autoGenerate = true)
    int id; String name; long startTime; String repeatDays; boolean enabled;
}
