package org.example.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Choice {

    private String name;
    private int amount;
    private ArrayList<String> options;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public void addOptions(String... options) {
        this.options.addAll(Arrays.asList(options));
    }
}
