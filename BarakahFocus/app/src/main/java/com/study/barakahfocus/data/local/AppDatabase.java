package com.study.barakahfocus.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.study.barakahfocus.data.local.dao.*;
import com.study.barakahfocus.data.local.entities.*;

@Database(entities = {
    Subject.class,
    Task.class,
    Flashcard.class,
    Note.class,
    StudySession.class,
    Routine.class,
    AppUsage.class,
    Reward.class,
    PrayerTime.class,
    Alarm.class
}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SubjectDao subjectDao();
    public abstract TaskDao taskDao();
    public abstract FlashcardDao flashcardDao();
    public abstract NoteDao noteDao();
    public abstract StudySessionDao studySessionDao();
    public abstract RoutineDao routineDao();
    public abstract AppUsageDao appUsageDao();
    public abstract RewardDao rewardDao();
    public abstract PrayerTimeDao prayerTimeDao();
    public abstract AlarmDao alarmDao();
}
