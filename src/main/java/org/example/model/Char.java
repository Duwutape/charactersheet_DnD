package org.example.model;

import org.example.classes.Bard;

public class Char {
    private String name;
    private GameClass gameClass = new Bard("test");
    private Species species;
    private int level;

    public void test() {

        gameClass.getPrimaryAbilities();
    }
}
