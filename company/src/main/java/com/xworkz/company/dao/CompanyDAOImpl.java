package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class CompanyDAOImpl implements CompanyDAO{
    @Override
    public void saveData(CompanyEntity companyEntity) {
        System.out.println("Saved Details are : " + companyEntity);


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("register");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(companyEntity);
        transaction.commit();
    } catch (Exception e) {
            e.printStackTrace();
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        }
}
