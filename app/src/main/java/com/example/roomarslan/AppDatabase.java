package com.example.roomarslan;

import androidx.room.Database;
import androidx.room.RoomDatabase;
//user class is the table name and pojo
// dao class method is userDao();
// UserDao is interface
//UserDao contains all methods and querries are in those methods

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}

