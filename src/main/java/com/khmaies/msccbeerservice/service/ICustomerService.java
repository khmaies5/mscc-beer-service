package com.khmaies.msccbeerservice.service;

import com.khmaies.msccbeerservice.web.model.CustomerDto;

import java.util.UUID;

public interface ICustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto savedCustomer(CustomerDto customerDTO);

    void updateCustomer(UUID customerId, CustomerDto customerDTO);

    void deleteById(UUID customerId);
}
