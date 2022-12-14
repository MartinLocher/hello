package com.maddin.hello.customercontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.maddin.hello.entity.customer;
import com.maddin.hello.repository.CustomerRepository;

@RestController
@CrossOrigin
@RequestMapping ("/customer")
public class CustomerController {
    
    private CustomerRepository customerRepository;

    public CustomerController (CustomerRepository customerRepository) {
        this.customerRepository=customerRepository;
    }
    @CrossOrigin
    @GetMapping("")
    public List<customer> index (){
        return (customerRepository.findAll());

    }

}
