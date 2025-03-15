package com.example.solr.services;

import java.util.List;

import com.example.solr.documents.Character;

public interface CharacterService {
    void save(Character character);

    List<Character> getCharacters();

    void updateCharacter(String id, String usename, String anime, String description);

    void deleteCharacter(String id);
}