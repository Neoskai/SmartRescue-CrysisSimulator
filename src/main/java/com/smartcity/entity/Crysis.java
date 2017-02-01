package com.smartcity.entity;

import static com.smartcity.entity.Level.HIGH;
import static com.smartcity.entity.Level.LOW;
import static com.smartcity.entity.Level.MEDIUM;

/**
 * Enum ereferencing all types of crysis possible
 * Created by lpotages on 19/12/16.
 */
public enum Crysis {
    FEU("Feu",HIGH, MEDIUM, LOW),
    CARRAMBOLAGE("Carrambolage",LOW,HIGH,HIGH),
    APOCALYPSE("Apocalypse", HIGH,HIGH,HIGH);

    private String name;

    private Level pompierLevel;
    private Level ambulanceLevel;
    private Level policeLevel;


   Crysis(String name, Level pompierLevel, Level ambulanceLevel, Level policeLevel){
       this.name = name;
       this.pompierLevel = pompierLevel;
       this.ambulanceLevel = ambulanceLevel;
       this.policeLevel = policeLevel;
    }

    public String getName() {
        return name;
    }

    public Level getPompierLevel() {
        return pompierLevel;
    }

    public void setPompierLevel(Level pompierLevel) {
        this.pompierLevel = pompierLevel;
    }

    public Level getAmbulanceLevel() {
        return ambulanceLevel;
    }

    public void setAmbulanceLevel(Level ambulanceLevel) {
        this.ambulanceLevel = ambulanceLevel;
    }

    public Level getPoliceLevel() {
        return policeLevel;
    }

    public void setPoliceLevel(Level policeLevel) {
        this.policeLevel = policeLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Crysis{" +
                "name='" + name + '\'' +
                ", pompierLevel=" + pompierLevel +
                ", ambulanceLevel=" + ambulanceLevel +
                ", policeLevel=" + policeLevel +
                '}';
    }
}
