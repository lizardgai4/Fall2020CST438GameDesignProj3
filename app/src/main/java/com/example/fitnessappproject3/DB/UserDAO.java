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

    @Query("SELECT * FROM users")
    List<User> getAllUsers();

    @Query("SELECT * FROM users where username LIKE :search")
    User getUserWithUsername(String search);

    @Query("SELECT * from users where userID=:userId")
    User getUserById(Integer userId);
}
