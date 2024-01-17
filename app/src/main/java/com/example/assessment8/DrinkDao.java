package com.example.assessment8;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.assessment8.db.Drink;

import java.util.List;

@Dao
public interface DrinkDao {

    @Query("SELECT * FROM drink")
    List<Drink> getAll();
    @Query("SELECT * FROM drink where id = :id limit 1")
    Drink findById(long id);
    @Update
    void update(Drink drink);
    @Delete
    void deleteAll(Drink... drinks);



    @Insert
    void insertAll(Drink... drinks);

    @Delete
    void delete(Drink drink);

}
