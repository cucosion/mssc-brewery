package com.ion.msscbrewery.service;

import com.ion.msscbrewery.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .beerName("galaxy cat")
                .beerStyle("Pale ale")
                .build();
    }

    @Override
    public BeerDTO saveBeer(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .beerName("galaxy cat")
                .beerStyle("Pale ale")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {
        log.info("Beer {} updated",beerId);
        //TODO: add a real impl

    }

    @Override
    public void deleteById(UUID beerId) {
        log.info("Beer {} deleted",beerId);
        //TODO: add real impl
    }
}
