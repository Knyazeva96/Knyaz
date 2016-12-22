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
    @Table(name="Poezda")
    public class Poezda implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="kodpoezda")
        private int kodpoezda;
        
        @Column(name="nomerpoezda")
        private String nomerpoezda;
        
      
        @Column(name="otkuda")
        private String otkuda;
        
        @Column(name="kuda")
        private String kuda;
        
         @Column(name="kolichestvovag")
        private int kolichestvovag;
         
          @Column(name="kolichestvomest")
        private int kolichestvomest;
          
          
    public Poezda() {
    }

    public Poezda(int kodpoezda, String nomerpoezda, String kuda, int kolichestvovag, int kolichestvomest) {
        this.kodpoezda = kodpoezda;
        this.nomerpoezda = nomerpoezda;
        this.kuda = kuda;
        this.kolichestvovag = kolichestvovag;
        this.kolichestvomest = kolichestvomest;
    }

    public int getKodpoezda() {
        return kodpoezda;
    }

    public void setKodpoezda(int kodpoezda) {
        this.kodpoezda = kodpoezda;
    }

    public String getNomerpoezda() {
        return nomerpoezda;
    }

    public void setNomerpoezda(String nomerpoezda) {
        this.nomerpoezda = nomerpoezda;
    }

    public String getOtkuda() {
        return otkuda;
    }

    public void setOtkuda(String otkuda) {
        this.otkuda = otkuda;
    }

    public String getKuda() {
        return kuda;
    }

    public void setKuda(String kuda) {
        this.kuda = kuda;
    }

    public int getKolichestvovag() {
        return kolichestvovag;
    }

    public void setKolichestvovag(int kolichestvovag) {
        this.kolichestvovag = kolichestvovag;
    }

    public int getKolichestvomest() {
        return kolichestvomest;
    }

    public void setKolichestvomest(int kolichestvomest) {
        this.kolichestvomest = kolichestvomest;
    }
  

        @Override
        public String toString() {
            return String.format("(%s, %s,%s,%s,%s,%s)", this.otkuda, this.nomerpoezda,this.kuda,this.kolichestvovag,this.kolichestvomest,this.kodpoezda);
        }

    public long getId() {
        return id;
    }
    }

