package com.study.barakahfocus.data.local.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "reward")
public class Reward {
    @PrimaryKey(autoGenerate = true)
    int id; String name; int pointsCost; boolean unlocked;
}
