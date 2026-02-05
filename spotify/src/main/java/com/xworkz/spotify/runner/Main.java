package com.xworkz.spotify.runner;

import com.xworkz.spotify.entity.SpotifyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("spotify");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
//adding a data through Collections (using add()method)
        List<SpotifyEntity> entity=new ArrayList<>();
        entity.add(new SpotifyEntity(1,"LifegoesOn","BTS",345L,true));
        entity.add(new SpotifyEntity(2,"carolofthebell","cimorelli",234L,false));
        entity.add(new SpotifyEntity(3,"I'll be there","Jin",167L,true));
        entity.add(new SpotifyEntity(4,"wildflower","RM",456L,true));
        entity.add(new SpotifyEntity(5,"Blue","Yung kai",105L,false));
        entity.add(new SpotifyEntity(6,"YourName","RADWiMPS",403L,true));
        for (SpotifyEntity spotify:entity){
            entityManager.persist(spotify);
        }


       //fetch or get the data
       SpotifyEntity  spotify=entityManager.find(SpotifyEntity.class,5);
        System.out.println(spotify.isAvaliable());
        System.out.println(spotify.toString());




        //update/set the data
        SpotifyEntity  spotify1=entityManager.find(SpotifyEntity.class,3);
        spotify1.setSongName("Dynamite");
        entityManager.merge(spotify1);



        //remove from the table
        entityManager.remove(spotify1);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
