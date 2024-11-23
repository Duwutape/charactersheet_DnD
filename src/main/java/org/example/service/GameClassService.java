package org.example.service;

import javafx.scene.control.ScrollPane;
import org.example.classes.*;
import org.example.model.GameClass;

import static org.example.Constants.*;

public class GameClassService {

    public GameClass createClass(String className, int level) {
        GameClass gameClass;
        switch (className) {
            case BARBARIAN -> gameClass = new Barbarian(0);
            case BARD -> gameClass = new Bard(0);
            case CLERIC -> gameClass = new Cleric(0);
            case DRUID -> gameClass = new Druid(0);
            case FIGHTER -> gameClass = new Fighter(0);
            case MONK -> gameClass = new Monk(0);
            case PALADIN -> gameClass = new Paladin(0);
            case RANGER -> gameClass = new Ranger(0);
            case SORCERER -> gameClass = new Sorcerer(0);
            case WARLOCK -> gameClass = new Warlock(0);
            case WIZARD -> gameClass = new Wizard(0);
            default -> gameClass = new GameClass(0);
        }

        updateClass(gameClass, level);

        return gameClass;
    }

    public void updateClass(GameClass gameClass,int level) {

        while (gameClass.getLevel() < level) {
            gameClass.increaseLevel();

            switch (gameClass.getClass().getName()) {
                case BARBARIAN -> updateBarbarian((Barbarian) gameClass);
                case BARD -> gameClass = new Bard(0);
                case CLERIC -> gameClass = new Cleric(0);
                case DRUID -> gameClass = new Druid(0);
                case FIGHTER -> gameClass = new Fighter(0);
                case MONK -> gameClass = new Monk(0);
                case PALADIN -> gameClass = new Paladin(0);
                case RANGER -> gameClass = new Ranger(0);
                case SORCERER -> gameClass = new Sorcerer(0);
                case WARLOCK -> gameClass = new Warlock(0);
                case WIZARD -> gameClass = new Wizard(0);
            }
        }


    }

    public void updateBarbarian(Barbarian barbarian) {

    }

    public void updateBarS(Bard bard) {

    }

    public void updateCleric(Cleric cleric) {

    }

    public void updateDruid(Druid druid) {

    }

    public void updateFighter(Fighter fighter) {

    }

    public void updateMonk(Monk monk) {

    }

    public void updatePaladin(Paladin paladin) {

    }

    public void updateRanger(Ranger ranger) {

    }

    public void updateRouge(Rogue rogue) {

    }

    public void updateSorcerer(Sorcerer sorcerer) {

    }

    public void updateWarlock(Warlock warlock) {

    }

    public void updateWizard(Wizard wizard) {

    }

}
