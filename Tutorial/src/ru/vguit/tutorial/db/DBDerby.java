/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ru.vguit.tutorial.persistens.Ostanovki;
import ru.vguit.tutorial.persistens.Poezda;
import ru.vguit.tutorial.persistens.Pokupateli;
import ru.vguit.tutorial.persistens.Pokupkabil;



/**
 *
 * @author pries
 */
public class DBDerby extends DBBase {

    /**
     * Интерфейс, используемый для взаимодействия с сущностью управляющей
     * фабрики для сохранения персистентного блока: отвечает за отображение
     * объектов в базу, поддержку соединений, кеш состояний и т.д. Его создание
     * это достаточно длительная и дорогая операция, поэтому создаем его один
     * раз на все приложение
     */
    private static final EntityManagerFactory emf;

    /**
     * Представляет собой интерфейс используемый для взаимодействия с контекстом
     * персистентности. Используется для поиска сущностей, их создания и
     * удаления, запроса к объектам-сущностям.
     */
    private EntityManager em;

    static {
        //Создаем сущность фабрики с использованием единицы персистентности
        emf = Persistence.createEntityManagerFactory("TutorialPU");
    }

    public DBDerby() {
        //создаем менеджера для работы с БД
        em = emf.createEntityManager();
    }

    public void addOstanovki(Ostanovki p) {
        //начинам транзакцию
        em.getTransaction().begin();

        //маппим объект в БД
        em.persist(p);

        //оканчиваем транзакцию
        em.getTransaction().commit();
    }
       public void addPoezda(Poezda oo) {
        //начинам транзакцию
        em.getTransaction().begin();

        //маппим объект в БД
        em.persist(oo);

        //оканчиваем транзакцию
        em.getTransaction().commit();
    }
        public void addPokupateli(Pokupateli o) {
        //начинам транзакцию
        em.getTransaction().begin();

        //маппим объект в БД
        em.persist(o);

        //оканчиваем транзакцию
        em.getTransaction().commit();
    }
        
        public void addPokupkabil(Pokupkabil op) {
        //начинам транзакцию
        em.getTransaction().begin();

        //маппим объект в БД
        em.persist(op);

        //оканчиваем транзакцию
        em.getTransaction().commit();
    }
    
        public Ostanovki find(long index) {
       Ostanovki p = em.find(Ostanovki.class, index);
        return p;
    }
      
    public void close() {
        em.close();
        emf.close();
    }
}
