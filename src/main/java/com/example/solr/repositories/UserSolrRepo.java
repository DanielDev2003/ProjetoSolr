package com.example.solr.repositories;

import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.solr.documents.UserDoc;

import java.util.List;

@Repository
public interface UserSolrRepo extends SolrCrudRepository<UserDoc, String> {

    @Query(value = "*:*")
    List<UserDoc> getUsers();

}
