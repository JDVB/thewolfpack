package com.realdolmen.wolfpack.controllers;

import com.realdolmen.wolfpack.ejbs.BeerEJB;
import com.realdolmen.wolfpack.entities.Beer;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JDOAX80 on 22/09/2015.
 */
@Named
@RequestScoped
public class BeerController {
    @Inject
    BeerEJB beerEJB;

    private List<Beer> beers = new ArrayList<>();

    public void beerButtonPressed(int id) {
       Beer beer  = beerEJB.findBeerById(id);
       beerEJB.addBeerToBeerCounter(beer);
    }



    public List<Beer> fetchAllBeers(){
        //return beerEJB.fetchAllBeers();
        Beer beer = new Beer("blond", "AB Inbev", "Leffe", 25, 8.5, "images/leffe.png");
        Beer beer2 = new Beer("zwaar", "AB Inbev", "Duvel", 25, 10, "images/duvel.png");
        Beer beer3 = new Beer("blond", "AB Inbev", "Jupiler", 25, 6, "images/jupiler.jpg");
        beers.add(beer);
        beers.add(beer2);
        beers.add(beer3);
        return beers;
    }
}
