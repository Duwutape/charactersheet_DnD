package org.example.classes;

import org.example.model.GameClass;

public class Druid extends GameClass {

    private int wildShape;

    public Druid(int level) {
        super(level);
    }

    public int getWildShape() {
        return wildShape;
    }

    public void setWildShape(int wildShape) {
        this.wildShape = wildShape;
    }
}
