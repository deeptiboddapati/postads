package com.deepti.PostAds.dao;

import com.deepti.PostAds.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DummyUserDataAccessService implements UserDao{
    private static List<User> DB = new ArrayList<>();
    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id, user.getUsername()));
        return 1;
    }
}
