package org.example.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GameClass {
    private Char aChar;

    //all classes
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
    private String subclass;

    //spells (bard/cleric/druid/paladin/ranger/sorcerer/warlock/wizard)
    private int amountPreparedSpells;
    private HashMap<Integer, Integer> spellSlots;
    private ArrayList<Spell> spells;

    //choose
    private ArrayList<Choice> choose = new ArrayList<>();

    public GameClass(int level) {
        this.level = level;
    }

    public Char getChar() {
        return aChar;
    }

    public void setChar(Char aChar) {
        this.aChar = aChar;
    }

    // all classes
    public ArrayList<String> getPrimaryAbilities() {
        return primaryAbilities;
    }

    public void setPrimaryAbilities(ArrayList<String> primaryAbilities) {
        this.primaryAbilities = primaryAbilities;
    }

    public void addPrimaryAbilities(String... primaryAbilities) {
        this.primaryAbilities.addAll(Arrays.asList(primaryAbilities));
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

    public void addSavingThrowProfs(String... savingThrowProfs) {
        this.savingThrowProfs.addAll(Arrays.asList(savingThrowProfs));
    }

    public ArrayList<String> getWeaponProfs() {
        return weaponProfs;
    }

    public void setWeaponProfs(ArrayList<String> weaponProfs) {
        this.weaponProfs = weaponProfs;
    }

    public void addWeaponProfs(String... weaponProfs) {
        this.weaponProfs.addAll(Arrays.asList(weaponProfs));
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

    public void addArmorTraining(String... armorTraining) {
        this.armorTraining.addAll(Arrays.asList(armorTraining));
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

    public void addFeatures(String... features) {
        this.features.addAll(Arrays.asList(features));
    }

    public ArrayList<String> getFeats() {
        return feats;
    }

    public void setFeats(ArrayList<String> feats) {
        this.feats = feats;
    }

    public void addFeats(String... feats) {
        this.feats.addAll(Arrays.asList(feats));
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    //spells
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
     @param level level of spell slot to be added/modified (0 = cantrip)
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

    public void addSpells(Spell... spells) {
        this.spells.addAll(Arrays.asList(spells));
    }

    public ArrayList<Choice> getChoose() {
        return choose;
    }

    public void setChoose(ArrayList<Choice> choose) {
        this.choose = choose;
    }

    public void addChoose(Choice choose) {
        this.choose.add(choose);
    }
}