package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
class CustomerController {
    private final CustomerDao customerDao;

    @GetMapping
    public List<Customer> customers() {
        var customers = customerDao.findAll();
        customers.forEach(customer -> log.info("Found a customer: {}", customer));
        return customers;
    }
}
