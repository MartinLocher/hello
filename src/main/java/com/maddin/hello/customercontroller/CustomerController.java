package com.maddin.hello.customercontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maddin.hello.entity.customer;
import com.maddin.hello.repository.CustomerRepository;

@RestController
@RequestMapping ("/customer")
public class CustomerController {
    
    private CustomerRepository customerRepository;

    public CustomerController (CustomerRepository customerRepository) {
        this.customerRepository=customerRepository;
    }

    @GetMapping("")
    public List<customer> index (){
        return (customerRepository.findAll());

    }

}
