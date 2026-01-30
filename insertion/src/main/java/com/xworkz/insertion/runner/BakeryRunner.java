package com.xworkz.insertion.runner;

import com.xworkz.insertion.entity.BakeryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BakeryRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("items");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            BakeryEntity bakeryEntity = entityManager.merge(new BakeryEntity(10,
                    "Fruity", 20D, "Mango"));
            entityManager.persist(bakeryEntity);
            transaction.commit();



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}