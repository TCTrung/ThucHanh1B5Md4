package com.example.thuchanh1b5md4.service;

import com.example.thuchanh1b5md4.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);
}
