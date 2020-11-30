package com.deepti.PostAds.service;

import com.deepti.PostAds.dao.UserDao;
import com.deepti.PostAds.model.User;

public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = null;
    }

    public int addUser(User user) {
        return userDao.insertUser(user);
    }
}
