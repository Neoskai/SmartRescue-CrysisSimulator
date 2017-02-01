package com.smartcity.entity;

/**
 * Enum with all the emergencies level
 * Created by lpotages on 21/10/16.
 */
public enum Level {
    LOW("Low", 7500, 15000),
    MEDIUM("Medium", 2500, 7500),
    HIGH("High", 0, 2500);

    private String name;
    private int lowerBound;
    private int higherBound;

    Level(String name, int lowerBound, int higherBound){
        this.name = name;
        this.lowerBound = lowerBound;
        this.higherBound = higherBound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getHigherBound() {
        return higherBound;
    }

    public void setHigherBound(int higherBound) {
        this.higherBound = higherBound;
    }
}
