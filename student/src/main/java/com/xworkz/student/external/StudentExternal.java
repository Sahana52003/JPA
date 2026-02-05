package com.xworkz.student.external;

import com.xworkz.student.entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class StudentExternal {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        List<StudentEntity> studentEntities=new ArrayList<>();
        studentEntities.add(new StudentEntity(1,"Sora","sora@gmail.com",4523173492L,16));
        studentEntities.add(new StudentEntity(2,"Swathi","swathi@gmail.com",3627181539L,20));
        studentEntities.add(new StudentEntity(3,"Bhargavi","bhargavi@gmail.com",8451946272L,21));
        studentEntities.add(new StudentEntity(4,"nandu","nandu@gmail.com",9562819462L,17));
        studentEntities.add(new StudentEntity(5,"Kavya","kavya@gmail.com",8416384629L,25));
        for (StudentEntity entity:studentEntities){
            entityManager.merge(entity);

        }
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
