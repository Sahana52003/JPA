package com.xworkz.update.runner;
import com.xworkz.insertion.entity.UpdateEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SweetUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("name");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            UpdateEntity updateEntity=entityManager.merge(new UpdateEntity(9,"Fanta",60D,"orange"));
            updateEntity.setCost(150D);
            updateEntity.setFlavor("Jeera");
            updateEntity.setItemName("Bindu");
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