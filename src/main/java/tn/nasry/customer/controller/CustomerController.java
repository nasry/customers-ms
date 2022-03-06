package tn.nasry.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.nasry.customer.entity.Customer;
import tn.nasry.customer.service.CustomerService;

import java.util.List;

@Controller
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> save(Customer customer) {
        return ResponseEntity.status(HttpStatus.CREATED).
                body(customerService.save(customer));
    }

    @PutMapping
    public ResponseEntity<Void> update(Customer customer) {
        customerService.save(customer);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Customer> findById(@PathVariable("id") Long customerId) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(customerService.getById(customerId));
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.findAll());
    }
}
