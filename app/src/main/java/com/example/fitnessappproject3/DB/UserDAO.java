package com.example.fitnessappproject3.DB;

import com.example.fitnessappproject3.Model.User;

import java.util.List;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

public interface UserDAO {

    @Insert
    void insertUser(User user);
    @Update
    void updateUser(User user);
    @Delete
    void deleteUser(User user);

    @Query("DELETE FROM users")
    void deleteAllUsers();

}
