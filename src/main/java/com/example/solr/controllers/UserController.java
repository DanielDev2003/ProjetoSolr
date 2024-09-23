package com.example.solr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.solr.documents.UserDoc;
import com.example.solr.services.UserService;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping  
    @ResponseBody
    public void save(@RequestBody UserDoc userDoc) {
        userService.save(userDoc);
    }

    @GetMapping 
    @ResponseBody
    public List<UserDoc> getUsers() {
        return userService.getUsers();
    }

    @DeleteMapping
    @ResponseBody
    public void deleteUser(@RequestParam String id) {
        userService.deleteUser(id);
    }
}
