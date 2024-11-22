package org.example.classes;

import org.example.model.GameClass;

public class Monk extends GameClass {

    private String martialArtsDie;
    private int focusPoints;
    private int unarmoredMovement;

    public String getMartialArtsDie() {
        return martialArtsDie;
    }

    public void setMartialArtsDie(String martialArtsDie) {
        this.martialArtsDie = martialArtsDie;
    }

    public int getFocusPoints() {
        return focusPoints;
    }

    public void setFocusPoints(int focusPoints) {
        this.focusPoints = focusPoints;
    }

    public int getUnarmoredMovement() {
        return unarmoredMovement;
    }

    public void setUnarmoredMovement(int unarmoredMovement) {
        this.unarmoredMovement = unarmoredMovement;
    }
}
