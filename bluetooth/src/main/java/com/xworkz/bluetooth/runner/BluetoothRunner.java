package com.xworkz.bluetooth.runner;

import com.xworkz.bluetooth.entity.BluetoothEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BluetoothRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("products");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        BluetoothEntity bluetoothEntity=new BluetoothEntity();
        BluetoothEntity bluetoothEntity1 = entityManager.find(BluetoothEntity.class, 3);
        System.out.println(bluetoothEntity1.toString());
        entityManager.persist(bluetoothEntity);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
