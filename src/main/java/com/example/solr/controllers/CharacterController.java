package com.example.solr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.solr.documents.Character;
import com.example.solr.services.CharacterService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/characters")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @PostMapping
    @ResponseBody
    public void save(@RequestBody Character character) {
        characterService.save(character);
    }

    @GetMapping
    @ResponseBody
    public List<Character> getCharacters() {
        return characterService.getCharacters();
    }

    @PutMapping
    @ResponseBody
    public void updateCharacter(@RequestParam String id, @RequestParam String username, @RequestParam String anime,
            @RequestParam String description) {
        characterService.updateCharacter(id, username, anime, description);
    }

    @DeleteMapping
    @ResponseBody
    public void deleteCharacter(@RequestParam String id) {
        characterService.deleteCharacter(id);
    }
}
