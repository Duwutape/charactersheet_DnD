package org.example.classes;

import org.example.model.GameClass;
import org.example.model.Spell;

import java.util.ArrayList;
import java.util.Arrays;

public class Bard extends GameClass {

    private String amountBardicInspiration;
    private ArrayList<Spell> magicalDiscoveriesSpells = new ArrayList<>();
    private boolean magicalDiscoveries = false;

    public Bard(int level) {
        super(level);
    }

    public String getAmountBardicInspiration() {
        return amountBardicInspiration;
    }

    public void setAmountBardicInspiration(String amountBardicInspiration) {
        this.amountBardicInspiration = amountBardicInspiration;
    }

    public ArrayList<Spell> getMagicalDiscoveriesSpells() {
        return magicalDiscoveriesSpells;
    }

    public void setMagicalDiscoveriesSpells(ArrayList<Spell> magicalDiscoveriesSpells) {
        this.magicalDiscoveriesSpells = magicalDiscoveriesSpells;
    }

    public void addMagicalDiscoverySpells(Spell... spells){
        this.magicalDiscoveriesSpells.addAll(Arrays.asList(spells));
    }

    public void removeMagicalDiscoverySpell(Spell spell){
        this.magicalDiscoveriesSpells.remove(spell);
    }

    public boolean hasMagicalDiscoveries() {
        return magicalDiscoveries;
    }

    public void setMagicalDiscoveries(boolean magicalDiscoveries) {
        this.magicalDiscoveries = magicalDiscoveries;
    }
}