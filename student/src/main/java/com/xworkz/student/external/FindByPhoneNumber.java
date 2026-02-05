package com.xworkz.student.external;

import com.xworkz.student.entity.StudentEntity;

import javax.persistence.*;

public class FindByPhoneNumber {
    public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("details");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();



    Query query = entityManager.createNamedQuery("FindBYPhoneNumber");
        query.setParameter("phoneNumberby", 3627181539L);
    //StudentEntity student=(StudentEntity)query.getSingleResult();
    Object singleResult = query.getSingleResult();
        System.out.println(singleResult);
}
}
