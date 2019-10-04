package com.ion.msscbrewery.service;

import com.ion.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID id);
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    void updateCustomer(UUID id, CustomerDTO customerDTO);
    void deleteById(UUID id);

}
