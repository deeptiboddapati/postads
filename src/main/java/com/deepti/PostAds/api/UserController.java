package com.deepti.PostAds.api;

import com.deepti.PostAds.model.User;
import com.deepti.PostAds.service.UserService;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    public void addUser( User user ){
        userService.addUser(user);
    }
}
