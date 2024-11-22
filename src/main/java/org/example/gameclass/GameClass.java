package org.example.gameclass;

import java.util.ArrayList;

public class GameClass {
    private String name;
    private ArrayList<String> primaryAbilities = new ArrayList<>();
    private String hitDice;
    private String hitDiceMod;
    private ArrayList<String> savingThrowProfs = new ArrayList<>();
    private ArrayList<String> weaponProfs = new ArrayList<>();
    private ArrayList<String> armorTraining = new ArrayList<>();
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
}