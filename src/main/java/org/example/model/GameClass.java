package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;

public class GameClass {
    //basic
    private ArrayList<String> primaryAbilities = new ArrayList<>();
    private String hitDie;
    private String hitDieMod;
    private ArrayList<String> savingThrowProfs = new ArrayList<>();
    private ArrayList<String> weaponProfs = new ArrayList<>();
    private int profBonus;
    private ArrayList<String> armorTraining = new ArrayList<>();
    private int level;
    private ArrayList<String> features = new ArrayList<>();
    private ArrayList<String> feats = new ArrayList<>();

    //spells (bard/cleric/druid/paladin/ranger/sorcerer/warlock/wizard)
    private int amountCantrip;
    private ArrayList<Spell> cantrips;
    private int amountPreparedSpells;
    private HashMap<Integer, Integer> spellSlots;
    private ArrayList<Spell> spells;

    public GameClass(int level) {
        this.level = level;
    }

    // basic
    public ArrayList<String> getPrimaryAbilities() {
        return primaryAbilities;
    }

    public void setPrimaryAbilities(ArrayList<String> primaryAbilities) {
        this.primaryAbilities = primaryAbilities;
    }

    public void addPrimaryAbilities(String primaryAbility) {
        this.primaryAbilities.add(primaryAbility);
    }

    public String getHitDie() {
        return hitDie;
    }

    public void setHitDie(String hitDie) {
        this.hitDie = hitDie;
    }

    public String getHitDieMod() {
        return hitDieMod;
    }

    public void setHitDieMod(String hitDieMod) {
        this.hitDieMod = hitDieMod;
    }

    public ArrayList<String> getSavingThrowProfs() {
        return savingThrowProfs;
    }

    public void setSavingThrowProfs(ArrayList<String> savingThrowProfs) {
        this.savingThrowProfs = savingThrowProfs;
    }

    public void addSavingThrowProfs(String savingThrowProf) {
        this.savingThrowProfs.add(savingThrowProf);
    }

    public ArrayList<String> getWeaponProfs() {
        return weaponProfs;
    }

    public void setWeaponProfs(ArrayList<String> weaponProfs) {
        this.weaponProfs = weaponProfs;
    }

    public void addWeaponProfs(String weaponProf) {
        this.weaponProfs.add(weaponProf);
    }

    public int getProfBonus() {
        return profBonus;
    }

    public void setProfBonus(int profBonus) {
        this.profBonus = profBonus;
    }

    public ArrayList<String> getArmorTraining() {
        return armorTraining;
    }

    public void setArmorTraining(ArrayList<String> armorTraining) {
        this.armorTraining = armorTraining;
    }

    public void setArmorTraining(String armorTraining) {
        this.armorTraining.add(armorTraining);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void increaseLevel() {
        this.level++;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<String> features) {
        this.features = features;
    }

    public void addFeatures(String feature) {
        this.features.add(feature);
    }

    public ArrayList<String> getFeats() {
        return feats;
    }

    public void setFeats(ArrayList<String> feats) {
        this.feats = feats;
    }

    public void addFeats(String feat) {
        this.feats.add(feat);
    }

    //spells
    public int getAmountCantrip() {
        return amountCantrip;
    }

    public void setAmountCantrip(int amountCantrip) {
        this.amountCantrip = amountCantrip;
    }

    public ArrayList<Spell> getCantrips() {
        return cantrips;
    }

    public void setCantrips(ArrayList<Spell> cantrips) {
        this.cantrips = cantrips;
    }

    public void addCantrips(Spell cantrip) {
        this.cantrips.add(cantrip);
    }

    public int getAmountPreparedSpells() {
        return amountPreparedSpells;
    }

    public void setAmountPreparedSpells(int amountPreparedSpells) {
        this.amountPreparedSpells = amountPreparedSpells;
    }

    public HashMap<Integer, Integer> getSpellSlots() {
        return spellSlots;
    }

    public void setSpellSlots(HashMap<Integer, Integer> spellSlots) {
        this.spellSlots = spellSlots;
    }

    /**
     Add or modify amount of spell slots.
     @param level level of spell slot to be added/modified
     @param amount (new) amount of spell slots
     */
    public void addSpellSlot(Integer level, Integer amount) {
        this.spellSlots.put(level, amount);
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public void addSpells(Spell spell) {
        spells.add(spell);
    }
}