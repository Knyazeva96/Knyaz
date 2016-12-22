/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial.persistens;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Сущность, которая будет маппитьсяв БД
 * 
 * @author a.pleshkanev
 */
    @Entity
    @Table(name="Ostanovki")
    public class Ostanovki implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="kodpoezda")
        private int kodpoezda;
        
        @Column(name="nazvaniestancii")
        private String nazvaniest;
        
        @Column(name="pribitie")
        private String pribitie;
        
        @Column(name="dlitelnostostanovki")
        private String dlitelnostostanovki;
        
        @Column(name="otpravlenie")
        private String otpravlenie;


    public Ostanovki(int kodpoezda, String nazvaniest, String pribitie, String dlitelnostostanovki, String otpravlenie) {
        this.kodpoezda = kodpoezda;
        this.nazvaniest = nazvaniest;
        this.pribitie = pribitie;
        this.dlitelnostostanovki = dlitelnostostanovki;
        this.otpravlenie = otpravlenie;
     
    }


    public String getNazvaniest() {
        return nazvaniest;
    }

    public void setNazvaniest(String nazvaniest) {
        this.nazvaniest = nazvaniest;
    }

    public String getPribitie() {
        return pribitie;
    }

    public void setPribitie(String pribitie) {
        this.pribitie = pribitie;
    }

    public String getDlitelnostostanovki() {
        return dlitelnostostanovki;
    }

    public void setDlitelnostostanovki(String dlitelnostostanovki) {
        this.dlitelnostostanovki = dlitelnostostanovki;
    }

    public String getOtpravlenie() {
        return otpravlenie;
    }

    public void setOtpravlenie(String otpravlenie) {
        this.otpravlenie = otpravlenie;
    }

    public void setKodpoezda(int kodpoezda) {
        this.kodpoezda = kodpoezda;
    }

    public Ostanovki() {
    }
   
        @Override
        public String toString() {
            return String.format("( %s,%s,%s,%s,%s)", this.pribitie, this.otpravlenie,this.nazvaniest,this.kodpoezda,this.dlitelnostostanovki);
        }
    }

