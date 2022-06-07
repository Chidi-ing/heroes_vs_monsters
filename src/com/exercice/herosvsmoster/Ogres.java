package com.exercice.herosvsmoster;

public class Ogres extends Monstres{

    public Ogres() {
        this.setStockCuir(0);
        this.setStockOr(RandomCuirOr.generateRessource());
        setName("orgre");
    }

    public int getForce() {
        return super.getEndurance() + 1;
    }


}
