package org.example.classes;

import org.example.model.GameClass;

public class Barbarian extends GameClass {

    private int amountRages;
    private int rageMod;

    public Barbarian(int level) {
        super(level);
    }

    public int getAmountRages() {
        return amountRages;
    }

    public void setAmountRages(int amountRages) {
        this.amountRages = amountRages;
    }

    public int getRageMod() {
        return rageMod;
    }

    public void setRageMod(int rageMod) {
        this.rageMod = rageMod;
    }
}
