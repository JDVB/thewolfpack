package com.realdolmen.wolfpack.ejbs;

import com.realdolmen.wolfpack.entities.Beer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by JDOAX80 on 22/09/2015.
 */
public class BeerEJB {

    @PersistenceContext
    EntityManager em;

    public List<Beer> fetchAllBeers() {
        TypedQuery<Beer> query = em.createNamedQuery(Beer.FIND_ALL, Beer.class);
        return query.getResultList();
    }

    public Beer findBeerById(int id) {
        TypedQuery<Beer> query = em.createNamedQuery(Beer.FIND_BEER_BY_ID, Beer.class);
        return query.setParameter("id", id).getSingleResult();
    }

    public void addBeerToBeerCounter(Beer beer) {
        int newCount = beer.getCount() + 1;
        double newTotalVolume = beer.getTotalVolume() + beer.getVolume();
        beer.setTotalVolume(newTotalVolume);
        beer.setCount(newCount);
    }
}
