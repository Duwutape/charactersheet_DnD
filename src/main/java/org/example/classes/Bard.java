package org.example.classes;

import org.example.model.GameClass;

public class Bard extends GameClass {

    private String bardicDie;

    public Bard(int level) {
        super(level);
    }

    public String getBardicDie() {
        return bardicDie;
    }

    public void setBardicDie(String bardicDie) {
        this.bardicDie = bardicDie;
    }
}