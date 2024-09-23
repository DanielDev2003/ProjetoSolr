package com.example.solr.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solr.documents.UserDoc;
import com.example.solr.repositories.UserSolrRepo;
import com.example.solr.services.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserSolrRepo userSolrRepo;

    @Override
    public void save(UserDoc doc) {
        userSolrRepo.save(doc);
    }

    @Override
    public List<UserDoc> getUsers() {
        return userSolrRepo.getUsers();
    }

    @Override
    public void deleteUser(String id) {
        userSolrRepo.deleteById(id);
    }
}
