package com.deepti.PostAds.api;

import com.deepti.PostAds.model.User;
import com.deepti.PostAds.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/user")
@RestController
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public void addUser( @RequestBody User user ){
        userService.addUser(user);
    }
    @GetMapping
    public List<User> getAllPeople(){
        return userService.getAllUsers();
    }
}
