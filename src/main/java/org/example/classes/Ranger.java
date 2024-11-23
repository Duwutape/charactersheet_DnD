package org.example.classes;

import org.example.model.GameClass;

public class Ranger extends GameClass {

    private int favoredEnemy;

    public Ranger(int level) {
        super(level);
    }

    public int getFavoredEnemy() {
        return favoredEnemy;
    }

    public void setFavoredEnemy(int favoredEnemy) {
        this.favoredEnemy = favoredEnemy;
    }
}
