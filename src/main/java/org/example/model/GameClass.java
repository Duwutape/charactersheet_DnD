package org.example.model;

import java.util.ArrayList;

public class GameClass {
    //basic
    private ArrayList<String> primaryAbilities = new ArrayList<>();
    private String hitDice;
    private String hitDiceMod;
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
    private int spellSlotsLvl1;
    private int spellSlotsLvl2;
    private int spellSlotsLvl3;
    private int spellSlotsLvl4;
    private int spellSlotsLvl5;
    private int spellSlotsLvl6;
    private int spellSlotsLvl7;
    private int spellSlotsLvl8;
    private int spellSlotsLvl9;
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

    public String getHitDice() {
        return hitDice;
    }

    public void setHitDice(String hitDice) {
        this.hitDice = hitDice;
    }

    public String getHitDiceMod() {
        return hitDiceMod;
    }

    public void setHitDiceMod(String hitDiceMod) {
        this.hitDiceMod = hitDiceMod;
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

    public int getSpellSlotsLvl1() {
        return spellSlotsLvl1;
    }

    public void setSpellSlotsLvl1(int spellSlotsLvl1) {
        this.spellSlotsLvl1 = spellSlotsLvl1;
    }

    public int getSpellSlotsLvl2() {
        return spellSlotsLvl2;
    }

    public void setSpellSlotsLvl2(int spellSlotsLvl2) {
        this.spellSlotsLvl2 = spellSlotsLvl2;
    }

    public int getSpellSlotsLvl3() {
        return spellSlotsLvl3;
    }

    public void setSpellSlotsLvl3(int spellSlotsLvl3) {
        this.spellSlotsLvl3 = spellSlotsLvl3;
    }

    public int getSpellSlotsLvl4() {
        return spellSlotsLvl4;
    }

    public void setSpellSlotsLvl4(int spellSlotsLvl4) {
        this.spellSlotsLvl4 = spellSlotsLvl4;
    }

    public int getSpellSlotsLvl5() {
        return spellSlotsLvl5;
    }

    public void setSpellSlotsLvl5(int spellSlotsLvl5) {
        this.spellSlotsLvl5 = spellSlotsLvl5;
    }

    public int getSpellSlotsLvl6() {
        return spellSlotsLvl6;
    }

    public void setSpellSlotsLvl6(int spellSlotsLvl6) {
        this.spellSlotsLvl6 = spellSlotsLvl6;
    }

    public int getSpellSlotsLvl7() {
        return spellSlotsLvl7;
    }

    public void setSpellSlotsLvl7(int spellSlotsLvl7) {
        this.spellSlotsLvl7 = spellSlotsLvl7;
    }

    public int getSpellSlotsLvl8() {
        return spellSlotsLvl8;
    }

    public void setSpellSlotsLvl8(int spellSlotsLvl8) {
        this.spellSlotsLvl8 = spellSlotsLvl8;
    }

    public int getSpellSlotsLvl9() {
        return spellSlotsLvl9;
    }

    public void setSpellSlotsLvl9(int spellSlotsLvl9) {
        this.spellSlotsLvl9 = spellSlotsLvl9;
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