package com.xworkz.apartment.runner;

import com.xworkz.apartment.entity.ApartmentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ApartmentRunner {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("visitor");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        ApartmentEntity apartment=new ApartmentEntity(10,"SORA-Blocks",40000,5628193672L);
        ApartmentEntity apartment1 = entityManager.find(ApartmentEntity.class, 3);
        System.out.println(apartment1.toString());
        entityManager.persist(apartment);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
