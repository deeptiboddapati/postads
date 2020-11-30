package com.deepti.PostAds.service;

import com.deepti.PostAds.dao.UserDao;
import com.deepti.PostAds.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao;
    @Autowired
    public UserService( @Qualifier("dummyDao") UserDao userDao) {
        this.userDao = null;
    }

    public int addUser(User user) {
        return userDao.insertUser(user);
    }
    public List<User> getAllUsers(){
        return userDao.selectAllUsers();
    }
}
