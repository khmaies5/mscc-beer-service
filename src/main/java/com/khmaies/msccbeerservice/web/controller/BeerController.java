package com.khmaies.msccbeerservice.web.controller;

import com.khmaies.msccbeerservice.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/")
public class BeerController {

    @GetMapping("beer/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId) {

        //todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping(path = "beer/")
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + UUID.randomUUID().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("beer/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {

        //todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("beer/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeerById(@PathVariable UUID beerId) {

        // todo impl
    }
}
