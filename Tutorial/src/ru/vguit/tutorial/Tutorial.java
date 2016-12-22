/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial;

import ru.vguit.tutorial.db.DBDerby;
import ru.vguit.tutorial.persistens.Ostanovki;
import ru.vguit.tutorial.persistens.Poezda;
import ru.vguit.tutorial.persistens.Pokupateli;
import ru.vguit.tutorial.persistens.Pokupkabil;

/**
 * Главный класс программы, представляет собой точку входа в программу
 *
 * @author a.pleshkanev
 */
public class Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DBDerby db = new DBDerby();

        Ostanovki ost = new Ostanovki(2,"ааа","bbb","vvv","ссс");

        db.addOstanovki(ost);

        //Point pDataBase = db.find(1L);

       // System.err.println("X = " + pDataBase.getX() + "Y = " + pDataBase.getY());
   

        DBDerby db1 = new DBDerby();

        Poezda poez;
        poez = new Poezda(3,"moskva","fuf",33,56);

        db1.addPoezda(poez);
        
        DBDerby db2 = new DBDerby();

        Pokupateli pok;
        pok = new Pokupateli(4,"aba","name","asf","aea",434,345);

        db1.addPoezda(poez);
        
        DBDerby db3 = new DBDerby();

        Pokupkabil pokup;
        pokup = new Pokupkabil(5,6,12,"asfda",42,"gjj",544);

        db1.addPoezda(poez);

        //Point pDataBase = db.find(1L);

       // System.err.println("X = " + pDataBase.getX() + "Y = " + pDataBase.getY());
    }
}
