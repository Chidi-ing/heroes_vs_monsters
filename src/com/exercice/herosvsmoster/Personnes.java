package com.exercice.herosvsmoster;

import java.util.ArrayList;
import java.util.Random;


public abstract class Personnes {

    Random rand = new Random();

    private String name;
    private int endurance;
    private int force;
    private int pointDeVieMAx;
    private int pointDeVie;
    private int stockOr;
    private int stockCuir;


    //#region constructeur Personnes
    public Personnes() {

        endurance = lance4Des();
        force = lance4Des();
        pointDeVieMAx = endurance + modificateur(endurance);
        pointDeVie = pointDeVieMAx;
        stockOr = 0;
        stockCuir = 0;
    }
    //#endregion

    //#region modificateur
    public int modificateur(int param){
        int valeurAjoute = 0;

        if( param == 0 && param < 5)
            valeurAjoute = -1;
        else if( param >= 5 && param < 10)
            valeurAjoute = 0;
        else if ( param >= 10 && param < 15)
            valeurAjoute = 1;
        else
            valeurAjoute = 2;

        System.out.println("Ajout de : " + valeurAjoute );

        return valeurAjoute;
    }
    //#endregion

    //#region lance4Des
    public int lance4Des(){

        ArrayList<Integer> listLanceDes = new ArrayList<>();
        int min =0, iposition =0, result =0;

        for(int i = 0; i < 4; i++)
            listLanceDes.add(rand.nextInt(1,6));

        min = listLanceDes.get(0);

        for(int i = 1; i < listLanceDes.size(); i++) {
            if (listLanceDes.get(i) < min) {
                min = listLanceDes.get(i);
                iposition = i;
            }
        }

        listLanceDes.remove(iposition);

        for(int i = 0; i < listLanceDes.size(); i++) {
            result += listLanceDes.get(i);
        }

        return result;
    }
    //#endregion

    //#region actionFrappe
    public int actionFrappe(){
        int degat = 0;
        degat = rand.nextInt(1,4) + modificateur(force);

        System.out.println("afflige " + degat + " de degat");

        return degat;
    }
    //#endregion

    //#region RetirePV
    public void RetirePV(int degat){
        pointDeVie -= degat;
        System.out.println("Point de vie : " + pointDeVie);

    }
    //#endregion

    //#region get set
    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public int getPointDeVieMAx() {
        return pointDeVieMAx;
    }

    public void setPointDeVieMAx(int pointDeVieMAx) {
        this.pointDeVieMAx = pointDeVieMAx;
    }

    public int getStockOr() {
        return stockOr;
    }

    public void setStockOr(int stockOr) {
        this.stockOr = stockOr;
    }

    public int getStockCuir() {
        return stockCuir;
    }

    public void setStockCuir(int stockCuir) {
        this.stockCuir = stockCuir;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    //#endregion

    //#region toString
    @Override
    public String toString() {
        return    name + "{" +
                "endurance=" + endurance + "(" + modificateur(endurance) + ")" +
                ", force=" + force +
                ", pointDeVie=" + pointDeVie +
                '}';
    }
    //#endregion
}
