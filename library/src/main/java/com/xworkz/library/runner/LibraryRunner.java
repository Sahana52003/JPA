package com.xworkz.library.runner;

import com.xworkz.library.entity.LibraryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LibraryRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("books");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        LibraryEntity library=new LibraryEntity(3,"strangers again",456789L);
        LibraryEntity library1=entityManager.find(LibraryEntity.class,2);
        System.out.println(library1.toString());
        entityManager.persist(library);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
