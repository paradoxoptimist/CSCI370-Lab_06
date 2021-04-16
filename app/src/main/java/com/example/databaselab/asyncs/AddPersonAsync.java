package com.example.databaselab.asyncs;

import android.os.AsyncTask;

import com.example.databaselab.entities.LabDatabase;
import com.example.databaselab.entities.Person;

public class AddPersonAsync extends AsyncTask<Person, Void, Void> {
    private LabDatabase database;

    public AddPersonAsync(LabDatabase database){
        this.database = database;
    }

    @Override
    protected Void doInBackground(Person... people){

        database.personDao().insertPerson(people[0]);
        return null;
    }
}
