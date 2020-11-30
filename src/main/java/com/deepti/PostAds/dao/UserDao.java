package com.deepti.PostAds.dao;

import com.deepti.PostAds.model.User;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.UUID;

public interface UserDao {
    int insertUser(UUID id, User user);
    default int insertUser( @Qualifier("DummyDAO") User user){
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }
    List<User> selectAllUsers();
}
