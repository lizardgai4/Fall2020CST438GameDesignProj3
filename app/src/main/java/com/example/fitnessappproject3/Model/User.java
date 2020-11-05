package com.example.fitnessappproject3.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

public interface User {
    @PrimaryKey(autoGenerate = true)
    private Integer userID;
    @ColumnInfo(name = "username")
    private String userName;
    @ColumnInfo(name = "password")
    private String password;
    @ColumnInfo(name = "first_name")
    private String firstName;
    @ColumnInfo(name = "last_name")
    private String lastName;

    public User(String userName, String password, String firstName, String lastName) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    }
}
