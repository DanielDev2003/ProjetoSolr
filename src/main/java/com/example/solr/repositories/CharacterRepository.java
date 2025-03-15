package com.example.solr.repositories;

import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.solr.documents.Character;

import java.util.List;

@Repository
public interface CharacterRepository extends SolrCrudRepository<Character, String> {

    @Query(value = "*:*")
    List<Character> getCharacters();

}
