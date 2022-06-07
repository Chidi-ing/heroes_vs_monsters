package com.exercice.herosvsmoster;

public class Humains extends Heros {

    public Humains() {
        setName("humain");

    }

    @Override
    public int getForce() {
        return super.getForce() + 1;
    }

    public int getEndurance() {
        return super.getEndurance() + 1;
    }



}
