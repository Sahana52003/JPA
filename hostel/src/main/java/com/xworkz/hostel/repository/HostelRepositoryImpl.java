package com.xworkz.hostel.repository;

import com.xworkz.hostel.entity.HostelEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class HostelRepositoryImpl implements HostelRepository{
    @Override
    public void confirmData(HostelEntity hostelEntity) {
        System.out.println("HostelRepository is Called : " + hostelEntity);


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("details");
        EntityManager entityManager=null;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(hostelEntity);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}

