package com.study.barakahfocus.data.local.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "prayertime")
public class PrayerTime {
    @PrimaryKey(autoGenerate = true)
    int id; String name; long time; boolean notified;
}
