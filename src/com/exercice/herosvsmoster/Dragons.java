package com.exercice.herosvsmoster;

public class Dragons extends Monstres {

    public Dragons() {
        this.setStockCuir(RandomCuirOr.generateRessource());
        this.setStockOr(RandomCuirOr.generateRessource());
        setName("dragon");
    }

    public int getEndurance() {
        return super.getEndurance() + 1;
    }
}
