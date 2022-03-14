package tn.nasry.customer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.nasry.customer.entity.Customer;
import tn.nasry.customer.repository.CustomerRepository;
import tn.nasry.customer.service.CustomerService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class CustomerApplicationTests {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService = new CustomerService();

    @BeforeEach
    void setMockOutput() {
        List<Customer> customers = Arrays.asList(new Customer(1L, "Nasri", "Achraf"),
                new Customer(2L, "Nasri", "Amal"),
                new Customer(3L, "Nasri", "Ayoub"));
        when(customerRepository.findAll()).thenReturn(customers);
    }

    @DisplayName("Test Mock helloService + helloRepository")
    @Test
    void testFindAll() {
        List<Customer> customers = customerService.findAll();
        assertEquals(3, customers.size());
    }

}
