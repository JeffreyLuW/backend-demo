package com.jeffrey.backend_demo.model;

public class Player {
    private String name;
    private int ppg;
    private int apg;
    private int rpg;

    // constructor
    public Player() {}
    public Player(String name, int ppg, int apg, int rpg) {
        this.name = name;
        this.ppg = ppg;
        this.apg = apg;
        this.rpg = rpg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPpg() {
        return ppg;
    }

    public void setPpg(int ppg) {
        this.ppg = ppg;
    }

    public int getApg() {
        return apg;
    }

    public void setApg(int apg) {
        this.apg = apg;
    }

    public int getRpg() {
        return rpg;
    }

    public void setRpg(int rpg) {
        this.rpg = rpg;
    }
}
