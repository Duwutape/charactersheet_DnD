package org.example.classes;

import org.example.model.GameClass;

public class Paladin extends GameClass {

    private int channelDivinity;

    public Paladin(int level) {
        super(level);
    }

    public int getChannelDivinity() {
        return channelDivinity;
    }

    public void setChannelDivinity(int channelDivinity) {
        this.channelDivinity = channelDivinity;
    }
}
