package com.khmaies.msccbeerservice.service;

import com.khmaies.msccbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface IBeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto savedBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
