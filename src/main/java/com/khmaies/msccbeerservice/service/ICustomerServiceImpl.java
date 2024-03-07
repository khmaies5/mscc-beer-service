package com.khmaies.msccbeerservice.service;

import com.khmaies.msccbeerservice.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class ICustomerServiceImpl implements ICustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Khmaies").build();
    }

    @Override
    public CustomerDto savedCustomer(CustomerDto customerDTO) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDTO) {
        //todo impl - add customer update
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer...");

    }
}
