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
    @Table(name="Pokupkabil")
    public class Pokupkabil implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="kodpokup")
        private int kodpokup;
        
        @Column(name="kodpoezda")
        private int kodpoezda;
        
        @Column(name="nomvag")
        private int nomvag;
        
        @Column(name="vidvag")
        private String vidvag;
        
        @Column(name="nommesta")
        private int nommesta;
        
        @Column(name="datapok")
        private String datapok;
        
        @Column(name="stoimbil")
        private int stoimbil;

    public Pokupkabil() {
    }

    public Pokupkabil(int kodpokup, int kodpoezda, int nomvag, String vidvag, int nommesta, String datapok, int stoimbil) {
        this.kodpokup = kodpokup;
        this.kodpoezda = kodpoezda;
        this.nomvag = nomvag;
        this.vidvag = vidvag;
        this.nommesta = nommesta;
        this.datapok = datapok;
        this.stoimbil = stoimbil;
    }

    public long getId() {
        return id;
    }

    public int getKodpokup() {
        return kodpokup;
    }

    public void setKodpokup(int kodpokup) {
        this.kodpokup = kodpokup;
    }

    public int getKodpoezda() {
        return kodpoezda;
    }

    public void setKodpoezda(int kodpoezda) {
        this.kodpoezda = kodpoezda;
    }

    public int getNomvag() {
        return nomvag;
    }

    public void setNomvag(int nomvag) {
        this.nomvag = nomvag;
    }

    public String getVidvag() {
        return vidvag;
    }

    public void setVidvag(String vidvag) {
        this.vidvag = vidvag;
    }

    public int getNommesta() {
        return nommesta;
    }

    public void setNommesta(int nommesta) {
        this.nommesta = nommesta;
    }

    public String getDatapok() {
        return datapok;
    }

    public void setDatapok(String datapok) {
        this.datapok = datapok;
    }

    public int getStoimbil() {
        return stoimbil;
    }

    public void setStoimbil(int stoimbil) {
        this.stoimbil = stoimbil;
    }

    
        @Override
        public String toString() {
            return String.format("(%s,%s,%s,%s,%s,%s,%s)", this.vidvag, this.stoimbil,this.nomvag,this.nommesta,this.kodpokup,this.kodpoezda,this.datapok);
        }
    }

