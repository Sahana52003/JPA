package com.xworkz.update.runner;
import com.xworkz.insertion.entity.UpdateEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class BakeryUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("name");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            UpdateEntity updateEntity=entityManager.merge(new UpdateEntity(7,"cupcake",150D,"Red Velvet"));
            updateEntity.setCost(30D);
            updateEntity.setFlavor("Black");
            updateEntity.setItemName("Sweet");
            entityManager.merge(updateEntity);
            entityManager.persist(updateEntity);
            transaction.commit();
            System.out.println(updateEntity.getCost()+" " +updateEntity.getFlavor()+" " +updateEntity.getItemName());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}