package com.jpa.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {
    private static final EntityManager ENTITY_MANAGER = entityManager();

    private static EntityManager entityManager() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("riskclient");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }

    public static  EntityManager getEntityManager(){
        if(ENTITY_MANAGER==null){
            return entityManager();
        }else{
            return ENTITY_MANAGER;
        }
    }


}
