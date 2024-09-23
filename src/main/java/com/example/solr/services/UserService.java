package com.example.solr.services;

import java.util.List;

import com.example.solr.documents.UserDoc;

public interface UserService {

    void save(UserDoc doc);
    List<UserDoc> getUsers();
    void deleteUser(String id);
}
