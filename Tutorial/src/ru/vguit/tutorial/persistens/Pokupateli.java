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
    @Table(name="Pokupateli")
    public class Pokupateli implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="kodpokupatelya")
        private int kodpokupatelya;
        
        @Column(name="Fam")
        private String Fam;
        
        @Column(name="name")
        private String name;
        
        @Column(name="otchestvo")
        private String otchestvo;
        
        @Column(name="datar")
        private String datar;
        
        @Column(name="nompasp")
        private int nompasp;
        
        @Column(name="serpasp")
        private int serpasp;
        

    public Pokupateli() {
    }

    public Pokupateli(int kodpokupatelya, String Fam, String name, String otchestvo, String datar, int nompasp, int serpasp) {
        this.kodpokupatelya = kodpokupatelya;
        this.Fam = Fam;
        this.name = name;
        this.otchestvo = otchestvo;
        this.datar = datar;
        this.nompasp = nompasp;
        this.serpasp = serpasp;
    }

    public int getKodpokupatelya() {
        return kodpokupatelya;
    }

    public void setKodpokupatelya(int kodpokupatelya) {
        this.kodpokupatelya = kodpokupatelya;
    }

    public String getFam() {
        return Fam;
    }

    public void setFam(String Fam) {
        this.Fam = Fam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getDatar() {
        return datar;
    }

    public void setDatar(String datar) {
        this.datar = datar;
    }

    public int getNompasp() {
        return nompasp;
    }

    public void setNompasp(int nompasp) {
        this.nompasp = nompasp;
    }

    public int getSerpasp() {
        return serpasp;
    }

    public long getId() {
        return id;
    }

    public void setSerpasp(int serpasp) {
        this.serpasp = serpasp;
    }

   


        @Override
        public String toString() {
            return String.format("(%s, %s,%s,%s,%s,%s,%s)", this.serpasp, this.otchestvo,this.nompasp,this.name,this.kodpokupatelya,this.datar,this.Fam);
        }
    }

