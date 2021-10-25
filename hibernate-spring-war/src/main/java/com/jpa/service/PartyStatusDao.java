package com.jpa.service;

import com.jpa.entities.PartyStatus;
import com.jpa.utils.EntityManagerProvider;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

@Component
public class PartyStatusDao {

    public String getDescription(){
        EntityManager em = EntityManagerProvider.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        PartyStatus partyStatus = em.find(PartyStatus.class, 12280L);
        tx.commit();
        return partyStatus.getDescription();
    }
}
