package com.example.databaselab;

@Dao
public interface PersonDao {
    @Insert
    void insertPerson(Person person);

    @Query('SELECT * FROM Person')
    List<Person> getAllPersons();
}
