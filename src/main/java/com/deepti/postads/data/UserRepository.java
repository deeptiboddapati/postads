package com.deepti.postads.data;

import com.deepti.postads.model.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserRepository {
    private List<User> all_Users = Arrays.asList(
            new User(1, "Santosh", "santosh@donotmail.com", "plaintextpasswordsarebad"),
            new User(2, "Deepti", "Deepti@donotmail.com", "plaintextpasswordsarebad"),
            new User(3, "Renuka", "Renuka@donotmail.com", "plaintextpasswordsarebad"),
            new User(4, "Padma", "Padma@donotmail.com", "plaintextpasswordsarebad")
    );

    public User findById( int id ){
        for(User user : all_Users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
