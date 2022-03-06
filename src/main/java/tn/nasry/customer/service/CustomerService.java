package tn.nasry.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.nasry.customer.entity.Customer;
import tn.nasry.customer.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getById(Long customerId) {
        return customerRepository.getById(customerId);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
