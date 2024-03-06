package com.khmaies.msccbeerservice.web.controller;

import com.khmaies.msccbeerservice.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/")
public class CustomerController {

    @GetMapping("customer/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable UUID customerId) {
        // todo impl
        return new ResponseEntity<>(CustomerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping("customer/")
    public ResponseEntity saveNewCustomer(@RequestBody CustomerDto customerDto) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer/" + UUID.randomUUID().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("customer/{customerId}")
    public ResponseEntity updateCustomerById(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto) {

        //todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("customer/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerById(@PathVariable UUID customerId) {

        // todo impl
    }
}
