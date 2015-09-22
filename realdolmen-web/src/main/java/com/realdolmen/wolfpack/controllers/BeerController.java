package com.realdolmen.wolfpack.controllers;

import com.realdolmen.wolfpack.ejbs.BeerEJB;
import com.realdolmen.wolfpack.entities.Beer;
import org.hibernate.validator.internal.util.ConcurrentReferenceHashMap;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by JDOAX80 on 22/09/2015.
 */
@Named
@RequestScoped
public class BeerController {
    @Inject
    BeerEJB beerEJB;

    private Map<Beer, Integer> beerMap = new HashMap<>();
    private List<Beer> beers = new ArrayList<>();

    public void beerButtonPressed(int id) {
       Beer beer  = beerEJB.findBeerById(id);
        int count;
       if(!beerMap.containsKey(beer)){
           count = 1;
           beerMap.put(beer, count);
        }
        else {
           count = beerMap.get(beer);
           beerMap.put(beer, count++);
       }
    }


    public List<Beer> fetchAllBeers(){
        //return beerEJB.fetchAllBeers();
        Beer beer = new Beer("blond", "AB Inbev", "Leffe", 25, 8.5);
        Beer beer2 = new Beer("zwaar", "AB Inbev", "Duvel", 25, 10);
        Beer beer3 = new Beer("blond", "AB Inbev", "Jupiler", 25, 6);
        beers.add(beer);
        beers.add(beer2);
        beers.add(beer3);
        return beers;
    }
}