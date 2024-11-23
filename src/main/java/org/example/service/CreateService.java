package org.example.service;

import org.example.model.Char;

public class CreateService {

    public Char createChar(String name, String className, String speciesName, String level) {
        Char character = new Char();
        character.setName(name);
        character.setLevel(Integer.parseInt(level));




        return  character;
    }
}
