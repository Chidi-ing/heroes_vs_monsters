package com.exercice.herosvsmoster;

public class Nains extends Heros{

    public Nains() {
        super();
        setName("nain");
    }

    public int getEndurance() {
        return super.getEndurance() + 2;
    }

}
