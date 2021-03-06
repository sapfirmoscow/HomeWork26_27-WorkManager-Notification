package ru.sberbank.homework26_27.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Alarm.class, version = 1)
public abstract class AlarmDB extends RoomDatabase {
    public abstract AlarmDAO getAlarmDAO();
}
