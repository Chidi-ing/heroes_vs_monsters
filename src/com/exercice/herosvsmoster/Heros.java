package com.exercice.herosvsmoster;

public abstract class Heros extends Personnes {

    public Heros() {
    }

    //#region depouille
    public void depouille(int or, int cuir){
        setStockOr(getStockOr() + or);
        setStockCuir(getStockCuir() + cuir);
    }
    //#endregion

    //#region repose
    public void repose(){
        System.out.println("combat termine le hero se repose");
        this.setPointDeVie(this.getPointDeVieMAx());
    }
    //#endregion



}
