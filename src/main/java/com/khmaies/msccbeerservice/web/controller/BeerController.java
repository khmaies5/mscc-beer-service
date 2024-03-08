package com.khmaies.msccbeerservice.web.controller;

import com.khmaies.msccbeerservice.service.IBeerService;
import com.khmaies.msccbeerservice.web.model.BeerDto;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Validated
@RestController
@RequestMapping("/api/v1/")
public class BeerController {

    private final IBeerService beerService;

    public BeerController(IBeerService beerService) {
        this.beerService = beerService;
    }


    @GetMapping("beer/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@NotNull @PathVariable UUID beerId) {

        //todo impl
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping(path = "beer/")
    public ResponseEntity saveNewBeer(@Valid @NotNull @RequestBody BeerDto beerDto) {

        BeerDto savedDto = beerService.savedBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        //todo add hostname to url
        headers.add("Location", "/api/v1/beer" + savedDto.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("beer/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable UUID beerId, @Valid @RequestBody BeerDto beerDto) {

        beerService.updateBeer(beerId, beerDto);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("beer/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeerById(@PathVariable UUID beerId) {
        beerService.deleteById(beerId);
    }


}
