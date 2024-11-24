package org.example.classes;

import org.example.model.GameClass;

public class Bard extends GameClass {

    private String amountBardicInspiration;

    public Bard(int level) {
        super(level);
    }

    public String getAmountBardicInspiration() {
        return amountBardicInspiration;
    }

    public void setAmountBardicInspiration(String amountBardicInspiration) {
        this.amountBardicInspiration = amountBardicInspiration;
    }
}