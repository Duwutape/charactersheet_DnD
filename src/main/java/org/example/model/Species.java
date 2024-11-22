package org.example.model;

import java.util.HashMap;

public class Species {

    private final String name;
    private HashMap<String, Integer> abilityModifiers;
    private String type;
    private String size;
    private int speedFeet;
    private int speedMeters;

    public Species(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getAbilityModifiers() {
        return abilityModifiers;
    }

    public void setAbilityModifiers(HashMap<String, Integer> abilityModifiers) {
        this.abilityModifiers = abilityModifiers;
    }

    public void addAbilityModifiers(String ability, int modifier) {
        this.abilityModifiers.put(ability, modifier);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSpeedFeet() {
        return speedFeet;
    }

    public void setSpeedFeet(int speedFeet) {
        this.speedFeet = speedFeet;
    }

    public int getSpeedMeters() {
        return speedMeters;
    }

    public void setSpeedMeters(int speedMeters) {
        this.speedMeters = speedMeters;
    }
}
