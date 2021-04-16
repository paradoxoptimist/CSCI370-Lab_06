package com.example.databaselab;

@Database(entities = {Person.class}, version = 1)
public abstract class LabDatabase extends RoomDatabase{

    public abstract PersonDao personDao();
}
