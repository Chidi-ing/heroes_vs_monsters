package com.exercice.herosvsmoster;

import java.util.Scanner;

public class Combat {

    Scanner sc =  new Scanner( System.in);
    Humains heros = new Humains();
    public void debutCombat(){

        System.out.println("Bienvenue dans la forêt de Shorewood.......Choisisez votre hero!:  (Humains : 1, nain :0) : ");
/*
        System.out.println("                     |-----|                                                                            ");
        System.out.println("                     |     |                                                                            ");
        System.out.println("                     |     |                                                                            ");
        System.out.println("       --------------|-----|---------------------------------------------------------------------       ");
        System.out.println("       | |  | |      |     |---------------------------------------------------------------------->     ");
        System.out.println("       |-|-|-|-------|-----|---------------------------------------------------------------------/      ");
        System.out.println("                     |     |                                                                            ");
        System.out.println("                     |     |                                                                            ");
        System.out.println("                     |-----|                                                                            ");
*/

    }

    //#region choixHero
    public void choixHero(){

        boolean creationHeros = false;
        System.out.println("Choisissez votre Héro ! (1 : humain, 2 : nain) : ");
        int choix = Integer.parseInt(sc.nextLine());

        while (creationHeros == false) {
            if (choix == 1) {
                Humains heros = new Humains();
                creationHeros = true;
            } else if (choix == 2) {
                Nains heros = new Nains();
                creationHeros = true;
            } else {
                System.out.println("Choisissez votre Héros ! (1 : humain, 2 : nain) : ");
            }
        }
    }
    //#endregion

    //#region choixMonstre
    public void choixMonstre(){

        boolean creationMonstre = false;
        System.out.println("Choisissez votre Montre ! (1 : loup, 2 : ogre, 3 : dragon) : ");
        int choix = Integer.parseInt(sc.nextLine());

        while (creationMonstre == false) {
            if (choix == 1) {
                Loups monstre = new Loups();
                creationMonstre = true;
            } else if (choix == 2) {
                Ogres mostre = new Ogres();
                creationMonstre = true;
            } else if (choix == 3) {
                Dragons mostre = new Dragons();
                creationMonstre = true;
            } else {
                System.out.println("Choisissez votre Montre ! (1 : loup, 2 : ogre, 3 : dragon) : ");
            }
        }
    }
    //#endregion

    public void combat(){

        int degat;
        System.out.println("Le combat commence");
        degat = heros.actionFrappe();







    }








}
