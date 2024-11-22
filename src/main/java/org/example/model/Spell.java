package org.example.model;

import java.util.ArrayList;

public class Spell {
    private final String NAME;
    private final int LEVEL;
    private boolean prepared;
    private ArrayList<String> components = new ArrayList<>();

    public Spell(String NAME, int LEVEL) {
        this.NAME = NAME;
        this.LEVEL = LEVEL;
    }

    public String getNAME() {
        return NAME;
    }

    public int getLEVEL() {
        return LEVEL;
    }

    public boolean isPrepared() {
        return prepared;
    }

    public void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    public ArrayList<String> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<String> components) {
        this.components = components;
    }
}
