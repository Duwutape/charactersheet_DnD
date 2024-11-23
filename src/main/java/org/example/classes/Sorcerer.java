package org.example.classes;

import org.example.model.GameClass;

public class Sorcerer extends GameClass {

    private int sorceryPoints;

    public Sorcerer(int level) {
        super(level);
    }

    public int getSorceryPoints() {
        return sorceryPoints;
    }

    public void setSorceryPoints(int sorceryPoints) {
        this.sorceryPoints = sorceryPoints;
    }
}
