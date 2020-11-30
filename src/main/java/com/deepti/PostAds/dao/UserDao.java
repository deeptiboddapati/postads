package com.deepti.PostAds.dao;

import com.deepti.PostAds.model.User;

import java.util.UUID;

public interface UserDao {
    int insertUser(UUID id, User user);
    default int insertUser(User user){
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }
}
