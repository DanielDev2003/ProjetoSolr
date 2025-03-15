package com.example.solr.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solr.documents.Character;
import com.example.solr.repositories.CharacterRepository;
import com.example.solr.services.CharacterService;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterServiceImpl implements CharacterService {
    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public void save(Character character) {
        characterRepository.save(character);
    }

    @Override
    public List<Character> getCharacters() {
        return characterRepository.getCharacters();
    }

    @Override
    public void updateCharacter(String id, String username, String anime, String description) {
        Optional<Character> optionalCharacter = characterRepository.findById(id);
        if (optionalCharacter.isPresent()) {
            Character character = optionalCharacter.get();
            character.setUsername(username);
            character.setAnime(anime);
            character.setDescription(description);
            characterRepository.save(character);
        } else {
            throw new RuntimeException("Character not found with id: " + id);
        }
    }

    @Override
    public void deleteCharacter(String id) {
        characterRepository.deleteById(id);
    }
}
