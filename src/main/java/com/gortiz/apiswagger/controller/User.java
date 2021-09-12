package com.gortiz.apiswagger.controller;

import java.util.Arrays;
import java.util.List;
import com.gortiz.apiswagger.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	@GetMapping
    public List<UserModel> getUsers() {

        return Arrays.asList(
                new UserModel("Sam", 2000L),
                new UserModel("Peter", 1000L)
        );
    }

    @GetMapping("/{userName}")
    public UserModel getUser(@PathVariable("userName") final String userName)
    {
        return new UserModel(userName, 1000L);
    }




}
