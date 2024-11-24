package org.example.service;

import org.example.classes.*;
import org.example.model.Choice;
import org.example.model.GameClass;

import java.util.HashMap;

import static org.example.Constants.*;

public class GameClassService {

    public GameClass createClass(String className, int level) {
        GameClass gameClass;
        switch (className) {
            case BARBARIAN -> gameClass = new Barbarian(-1);
            case BARD -> gameClass = new Bard(-1);
            case CLERIC -> gameClass = new Cleric(-1);
            case DRUID -> gameClass = new Druid(-1);
            case FIGHTER -> gameClass = new Fighter(-1);
            case MONK -> gameClass = new Monk(-1);
            case PALADIN -> gameClass = new Paladin(-1);
            case RANGER -> gameClass = new Ranger(-1);
            case ROUGE -> gameClass = new Rogue(-1);
            case SORCERER -> gameClass = new Sorcerer(-1);
            case WARLOCK -> gameClass = new Warlock(-1);
            case WIZARD -> gameClass = new Wizard(-1);
            default -> gameClass = new GameClass(-1);
        }

        updateClass(gameClass, level);

        return gameClass;
    }

    public void updateClass(GameClass gameClass, int level) {

        while (gameClass.getLevel() < level) {
            gameClass.increaseLevel();

            switch (gameClass.getClass().getName()) {
                case BARBARIAN -> updateBarbarian((Barbarian) gameClass);
                case BARD -> updateBard((Bard) gameClass);
                case CLERIC -> updateCleric((Cleric) gameClass);
                case DRUID -> updateDruid((Druid) gameClass);
                case FIGHTER -> updateFighter((Fighter) gameClass);
                case MONK -> updateMonk((Monk) gameClass);
                case PALADIN -> updatePaladin((Paladin) gameClass);
                case RANGER -> updateRanger((Ranger) gameClass);
                case ROUGE -> updateRouge((Rogue) gameClass);
                case SORCERER -> updateSorcerer((Sorcerer) gameClass);
                case WARLOCK -> updateWarlock((Warlock) gameClass);
                case WIZARD -> updateWizard((Wizard) gameClass);
            }
        }
    }

    private void abilitySkillImprovement(GameClass gameClass){
        Choice choice = new Choice();
        choice.setName(ABILITY_SCORE_IMPROVEMENT);
        gameClass.addChoose(choice);
    }

    private void expertise(GameClass gameClass, int amount){
        Choice choice = new Choice();
        choice.setName(EXPERTISE);
        choice.setAmount(amount);
        gameClass.addChoose(choice);
    }

    private void updateBarbarian(Barbarian barbarian) {
        switch (barbarian.getLevel()) {
            case 0 -> {
                barbarian.addPrimaryAbilities(STRENGTH);
                barbarian.setHitDie(D12);
                barbarian.setHitDieMod(CONSTITUTION);
                barbarian.addSavingThrowProfs(STRENGTH, CONSTITUTION);
                Choice choice = new Choice();
                choice.setName(SKILL_PROFICIENCIES);
                choice.setAmount(2);
                choice.addOptions(ANIMAL_HANDLING, ATHLETICS, INTIMIDATION, NATURE, PERCEPTION, SURVIVAL);
                barbarian.addChoose(choice);
                barbarian.addWeaponProfs(SIMPLE_WEAPON, MARTIAL_WEAPON);
                barbarian.addArmorTraining(LIGHT_ARMOR, MEDIUM_ARMOR, SHIELD);
            }
            case 1 -> {
                barbarian.setProfBonus(2);
                barbarian.addFeatures(RAGE,UNARMORED_DEFENCE);
                if (barbarian.getChar().getVersion().equals(VERSION_2024)) {
                    barbarian.addFeatures(WEAPON_MASTERY);
                    barbarian.setWeaponMastery(2);
                }
                barbarian.setAmountRages(2);
                barbarian.setRageMod(2);
            }
            case 2 -> barbarian.addFeatures(DANGER_SENSE,RECKLESS_ATTACK);
            case 3 -> {
                Choice choice = new Choice();
                choice.setName(BARBARIAN + " " + SUBCLASS);
                choice.setAmount(1);
                if (barbarian.getChar().getVersion().equals(VERSION_2014)){
                    choice.addOptions(BERSERKER,TOTEM_WARRIOR);
                } else {
                    choice.addOptions(BERSERKER,WILD_HEART,WORLD_TREE,ZEALOT);
                    barbarian.addFeatures(PRIMAL_KNOWLEDGE);
                }
                barbarian.addChoose(choice);
                barbarian.setAmountRages(3);
            }
            case 4 -> {
                abilitySkillImprovement(barbarian);
                if (barbarian.getChar().getVersion().equals(VERSION_2024)) {
                    barbarian.setWeaponMastery(3);
                }
            }
            case 5 -> {
                barbarian.setProfBonus(3);
                barbarian.addFeatures(EXTRA_ATTACK,FAST_MOVEMENT);
            }
            case 6 -> {
                switch (barbarian.getSubclass()) {
                    case BERSERKER -> barbarian.addFeatures(MINDLESS_RAGE);
                    case TOTEM_WARRIOR -> {
                        barbarian.addFeatures(ASPECT_OF_THE_BEAST);
                        Choice choice = new Choice();
                        choice.setName(TOTEM_ANIMAL);
                        choice.setAmount(1);
                        choice.addOptions(BEAR,EAGLE,WOLF);
                    }
                    case WILD_HEART -> {
                        barbarian.addFeatures(ASPECT_OF_THE_WILDS);
                        Choice choice = new Choice();
                        choice.setName(ANIMAL_POWER);
                        choice.setAmount(1);
                        choice.addOptions(OWL,PANTHER,SALMON);
                    }
                    case WORLD_TREE -> barbarian.addFeatures(BRANCHES_OF_THE_TREE);
                    case ZEALOT -> barbarian.addFeatures(FANATICAL_FOCUS);
                }
            }
            case 7 -> {
                barbarian.addFeatures(FERAL_INSTINCT);
                if (barbarian.getChar().getVersion().equals(VERSION_2024)){
                    barbarian.addFeatures(INSTINCTIVE_POUNCE);
                }
            }
            case 8 -> {
                abilitySkillImprovement(barbarian);
            }
            case 9 -> {
                barbarian.setProfBonus(4);
                if (barbarian.getChar().getVersion().equals(VERSION_2014)){
                    barbarian.addFeatures(BRUTAL_CRITICAL_1);
                } else {
                    barbarian.addFeatures(BRUTAL_STRIKE);
                }
                barbarian.setRageMod(3);
            }
            case 10 -> {
                switch (barbarian.getSubclass()){
                    case BERSERKER -> {
                        if (barbarian.getChar().getVersion().equals(VERSION_2014)) {
                            barbarian.addFeatures(INTIMIDATING_PRESENCE);
                        } else {
                            barbarian.addFeatures(RETALIATION);
                        }
                    }
                    case TOTEM_WARRIOR -> barbarian.addFeatures(SPIRIT_WALKER);
                    case WILD_HEART -> barbarian.addFeatures(NATURE_SPEAKER);
                    case WORLD_TREE -> barbarian.addFeatures(BATTERING_ROOTS);
                    case ZEALOT -> barbarian.addFeatures(ZEALOUS_PRESENCE);
                }
                if (barbarian.getChar().getVersion().equals(VERSION_2024)){
                    barbarian.setWeaponMastery(4);
                }
            }
            case 11 -> barbarian.addFeatures(RELENTLESS_RAGE);
            case 12 -> {
                barbarian.setAmountRages(5);
                abilitySkillImprovement(barbarian);
            }
            case 13 -> {
                barbarian.setProfBonus(5);
                if (barbarian.getChar().getVersion().equals(VERSION_2014)){
                    barbarian.addFeatureAtIndex(BRUTAL_CRITICAL_2, barbarian.getFeatures().indexOf(BRUTAL_CRITICAL_1));
                    barbarian.removeFeature(BRUTAL_CRITICAL_1);
                } else {
                    barbarian.addFeatureAtIndex(IMPROVED_BRUTAL_STRIKE_1, barbarian.getFeatures().indexOf(BRUTAL_STRIKE)+1);
                }
            }
            case 14 -> {
                switch (barbarian.getSubclass()){
                    case BERSERKER -> {
                        if (barbarian.getChar().getVersion().equals(VERSION_2014)) {
                            barbarian.addFeatures(RETALIATION);
                        } else {
                            barbarian.addFeatures(INTIMIDATING_PRESENCE);
                        }
                    }
                    case TOTEM_WARRIOR -> {
                        barbarian.addFeatures(TOTEMIC_ATTUNEMENT);
                        Choice choice = new Choice();
                        choice.setName(TOTEM_ANIMAL);
                        choice.setAmount(1);
                        choice.addOptions(BEAR,EAGLE,WOLF);
                    }
                    case WILD_HEART -> {
                        barbarian.addFeatures(POWER_OF_THE_WILDS);
                        Choice choice = new Choice();
                        choice.setName(ANIMAL_POWER);
                        choice.setAmount(1);
                        choice.addOptions(FALCON,LION,RAM);
                    }
                    case WORLD_TREE -> barbarian.addFeatures(TRAVEL_ALONG_THE_TREE);
                    case ZEALOT -> barbarian.addFeatures(RAGE_OF_THE_GODS);
                }
            }
            case 15 -> {
                barbarian.addFeatures(PERSISTENT_RAGE);
                barbarian.setRageMod(4);
            }
            case 16 -> {
                abilitySkillImprovement(barbarian);
                barbarian.setRageMod(4);
            }
            case 17 -> {
                barbarian.setProfBonus(6);
                if (barbarian.getChar().getVersion().equals(VERSION_2014)) {
                    barbarian.addFeatureAtIndex(BRUTAL_CRITICAL_3, barbarian.getFeatures().indexOf(BRUTAL_CRITICAL_2));
                    barbarian.removeFeature(BRUTAL_CRITICAL_2);
                } else {
                    barbarian.addFeatureAtIndex(IMPROVED_BRUTAL_STRIKE_2, barbarian.getFeatures().indexOf(IMPROVED_BRUTAL_STRIKE_1)+1);
                }
                barbarian.setAmountRages(6);
            }
            case 18 -> barbarian.addFeatures(INDOMITABLE_MIGHT);
            case 19 -> {
                if (barbarian.getChar().getVersion().equals(VERSION_2014)){
                    abilitySkillImprovement(barbarian);
                } else {
                    barbarian.addFeatures(EPIC_BOON);
                }
            }
            case 20 -> {
                barbarian.addFeatures(PRIMAL_CHAMPION);
                if (barbarian.getChar().getVersion().equals(VERSION_2014)){
                    barbarian.setAmountRages(7);
                }
            }
        }
    }

    private void updateBard(Bard bard) {
        switch (bard.getLevel()) {
            case 0 -> {
                bard.addPrimaryAbilities(CHARISMA);
                bard.setHitDie(D8);
                bard.setHitDieMod(CONSTITUTION);
                bard.addSavingThrowProfs(DEXTERITY, CHARISMA);
                Choice choiceSkill = new Choice();
                choiceSkill.setName(SKILL_PROFICIENCIES);
                choiceSkill.setAmount(3);
                choiceSkill.addOptions(ALL_SKILLS);
                bard.addChoose(choiceSkill);
                Choice choiceTool = new Choice();
                choiceTool.setName(TOOL_PROFICIENCIES);
                choiceTool.setAmount(3);
                choiceTool.addOptions(INSTRUMENTS);
                bard.addChoose(choiceTool);
                bard.addWeaponProfs(SIMPLE_WEAPON);
                bard.addArmorTraining(LIGHT_ARMOR);
            }
            case 1 -> {
                bard.setProfBonus(2);
                bard.addFeatures(SPELLCASTING);
                bard.addFeatures(BARDIC_INSPIRATION_D6);
                bard.addSpellSlot(0,2);
                bard.addSpellSlot(1,2);
                bard.setAmountPreparedSpells(4);
            }
            case 2 -> {
                bard.addFeatures(JACK_OF_ALL_TRADES);
                if (bard.getChar().getVersion().equals(VERSION_2014)){
                    bard.addFeatures(SONG_OF_REST_D6);
                } else {
                   expertise(bard, 2);
                }
                bard.addSpellSlot(1,3);
                bard.setAmountPreparedSpells(5);
            }
            case 3 -> {
                Choice choice = new Choice();
                choice.setName(BARD + " " + SUBCLASS);
                choice.setAmount(1);
                if (bard.getChar().getVersion().equals(VERSION_2014)){
                    expertise(bard, 2);
                    choice.addOptions(LORE, VALOR);
                } else {
                    choice.addOptions(DANCE,GLAMOUR,LORE,VALOR);
                }
                bard.addChoose(choice);
                bard.addSpellSlot(1,4);
                bard.addSpellSlot(2,2);
                bard.setAmountPreparedSpells(6);
            }
            case 4 -> {
                abilitySkillImprovement(bard);
                bard.addSpellSlot(0,3);
                bard.addSpellSlot(2,3);
                bard.addSpellSlot(3,2);
                bard.setAmountPreparedSpells(7);
            }
            case 5 -> {
                bard.setProfBonus(3);
                bard.addFeatureAtIndex(BARDIC_INSPIRATION_D8,bard.getFeatures().indexOf(BARDIC_INSPIRATION_D6));
                bard.removeFeature(BARDIC_INSPIRATION_D6);
                bard.addFeatures(FONT_OF_INSPIRATION);
                if (bard.getChar().getVersion().equals(VERSION_2014)){
                    bard.setAmountPreparedSpells(8);
                } else {
                    bard.setAmountPreparedSpells(9);
                }
            }
            case 6 -> {
                if (bard.getChar().getVersion().equals(VERSION_2014)){
                    bard.addFeatures(COUNTERCHARM);
                    bard.setAmountPreparedSpells(9);
                } else {
                    bard.setAmountPreparedSpells(10);
                }
                bard.addSpellSlot(3,3);
                switch (bard.getSubclass()) {
                    case DANCE -> bard.addFeatures(INSPIRING_MOVEMENT, TANDEM_FOOTWORK);
                    case GLAMOUR -> bard.addFeatures(MANTLE_OF_MAJESTY);
                    case LORE -> {
                        if (bard.getChar().getVersion().equals(VERSION_2014)){
                            Choice choice = new Choice();
                            choice.setName(ADDITIONAL_MAGICAL_SECRETS);
                            choice.setAmount(2);
                            choice.addOptions();
                        }
                        bard.addFeatures(MAGICAL_DISCOVERIES);
                        bard.setMagicalDiscoveries(true);
                        Choice choice = new Choice();
                        choice.setName(MAGICAL_DISCOVERIES);
                        choice.setAmount(2);
                        bard.addChoose(choice);
                    }
                    case VALOR -> bard.addFeatures(EXTRA_ATTACK);
                }
            }
            case 7 -> {

            }
            case 8 -> {

            }
            case 9 -> {

            }
            case 10 -> {

            }
            case 11 -> {

            }
            case 12 -> {

            }
            case 13 -> {

            }
            case 14 -> {

            }
            case 15 -> {

            }
            case 16 -> {

            }
            case 17 -> {

            }
            case 18 -> {

            }
            case 19 -> {

            }
            case 20 -> {

            }
        }
    }

    private void magicalDiscovery(Bard bard) {
        Choice choice = new Choice();
        choice.setName(MAGICAL_DISCOVERIES);
        choice.setAmount(1);
        bard.addChoose(choice);
    }

    public void updateCleric(Cleric cleric) {
        switch (cleric.getLevel()) {
            case 0 -> {}
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {}
            case 9 -> {}
            case 10 -> {}
            case 11 -> {}
            case 12 -> {}
            case 13 -> {}
            case 14 -> {}
            case 15 -> {}
            case 16 -> {}
            case 17 -> {}
            case 18 -> {}
            case 19 -> {}
            case 20 -> {}
        }
    }

    public void updateDruid(Druid druid) {
        switch (druid.getLevel()) {
            case 0 -> {}
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {}
            case 9 -> {}
            case 10 -> {}
            case 11 -> {}
            case 12 -> {}
            case 13 -> {}
            case 14 -> {}
            case 15 -> {}
            case 16 -> {}
            case 17 -> {}
            case 18 -> {}
            case 19 -> {}
            case 20 -> {}
        }
    }

    public void updateFighter(Fighter fighter) {
        switch (fighter.getLevel()) {
            case 0 -> {}
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {}
            case 9 -> {}
            case 10 -> {}
            case 11 -> {}
            case 12 -> {}
            case 13 -> {}
            case 14 -> {}
            case 15 -> {}
            case 16 -> {}
            case 17 -> {}
            case 18 -> {}
            case 19 -> {}
            case 20 -> {}
        }
    }

    public void updateMonk(Monk monk) {
        switch (monk.getLevel()) {
            case 0 -> {}
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {}
            case 9 -> {}
            case 10 -> {}
            case 11 -> {}
            case 12 -> {}
            case 13 -> {}
            case 14 -> {}
            case 15 -> {}
            case 16 -> {}
            case 17 -> {}
            case 18 -> {}
            case 19 -> {}
            case 20 -> {}
        }
    }

    public void updatePaladin(Paladin paladin) {
        switch (paladin.getLevel()) {
            case 0 -> {}
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {}
            case 9 -> {}
            case 10 -> {}
            case 11 -> {}
            case 12 -> {}
            case 13 -> {}
            case 14 -> {}
            case 15 -> {}
            case 16 -> {}
            case 17 -> {}
            case 18 -> {}
            case 19 -> {}
            case 20 -> {}
        }
    }

    public void updateRanger(Ranger ranger) {
        switch (ranger.getLevel()) {
            case 0 -> {}
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {}
            case 9 -> {}
            case 10 -> {}
            case 11 -> {}
            case 12 -> {}
            case 13 -> {}
            case 14 -> {}
            case 15 -> {}
            case 16 -> {}
            case 17 -> {}
            case 18 -> {}
            case 19 -> {}
            case 20 -> {}
        }
    }

    public void updateRouge(Rogue rogue) {
        switch (rogue.getLevel()) {
            case 0 -> {}
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {}
            case 9 -> {}
            case 10 -> {}
            case 11 -> {}
            case 12 -> {}
            case 13 -> {}
            case 14 -> {}
            case 15 -> {}
            case 16 -> {}
            case 17 -> {}
            case 18 -> {}
            case 19 -> {}
            case 20 -> {}
        }
    }

    public void updateSorcerer(Sorcerer sorcerer) {
        switch (sorcerer.getLevel()) {
            case 0 -> {}
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {}
            case 9 -> {}
            case 10 -> {}
            case 11 -> {}
            case 12 -> {}
            case 13 -> {}
            case 14 -> {}
            case 15 -> {}
            case 16 -> {}
            case 17 -> {}
            case 18 -> {}
            case 19 -> {}
            case 20 -> {}
        }
    }

    public void updateWarlock(Warlock warlock) {
        switch (warlock.getLevel()) {
            case 0 -> {}
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {}
            case 9 -> {}
            case 10 -> {}
            case 11 -> {}
            case 12 -> {}
            case 13 -> {}
            case 14 -> {}
            case 15 -> {}
            case 16 -> {}
            case 17 -> {}
            case 18 -> {}
            case 19 -> {}
            case 20 -> {}
        }
    }

    public void updateWizard(Wizard wizard) {
        switch (wizard.getLevel()) {
            case 0 -> {}
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {}
            case 9 -> {}
            case 10 -> {}
            case 11 -> {}
            case 12 -> {}
            case 13 -> {}
            case 14 -> {}
            case 15 -> {}
            case 16 -> {}
            case 17 -> {}
            case 18 -> {}
            case 19 -> {}
            case 20 -> {}
        }
    }

}
