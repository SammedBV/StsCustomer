package com.example.customermanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customermanage.model.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long>{

}
