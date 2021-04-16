package com.example.databaselab.entities;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.databaselab.dao.PersonDao;

@Database(entities = {Person.class}, version = 1)
public abstract class LabDatabase extends RoomDatabase {

    public abstract PersonDao personDao();
}
