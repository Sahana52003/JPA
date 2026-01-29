package com.xworkz.camera.runner;

import com.xworkz.camera.entity.CameraEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CameraRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("cameradata");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        //CameraEntity camera=new CameraEntity(8,"Leica","Black",4567.22F);
        CameraEntity camera1=entityManager.find(CameraEntity.class,4);
        System.out.println(camera1.getProductName());
        //entityManager.persist(camera);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
