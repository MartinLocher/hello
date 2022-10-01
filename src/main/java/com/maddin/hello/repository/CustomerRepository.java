package com.maddin.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maddin.hello.entity.customer;

public interface CustomerRepository extends JpaRepository <customer, Long> {
    
}
