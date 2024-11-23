package org.example.classes;

import org.example.model.GameClass;

public class Rogue extends GameClass {

    private String sneakAttackDice;

    public Rogue(int level) {
        super(level);
    }

    public String getSneakAttackDice() {
        return sneakAttackDice;
    }

    public void setSneakAttackDice(String sneakAttackDice) {
        this.sneakAttackDice = sneakAttackDice;
    }
}
