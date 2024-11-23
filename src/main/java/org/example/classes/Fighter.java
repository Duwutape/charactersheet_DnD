package org.example.classes;

import org.example.model.GameClass;

public class Fighter extends GameClass {

    private int secondWind;
    private int weaponMastery;

    public Fighter(int level) {
        super(level);
    }

    public int getSecondWind() {
        return secondWind;
    }

    public void setSecondWind(int secondWind) {
        this.secondWind = secondWind;
    }

    public int getWeaponMastery() {
        return weaponMastery;
    }

    public void setWeaponMastery(int weaponMastery) {
        this.weaponMastery = weaponMastery;
    }
}
