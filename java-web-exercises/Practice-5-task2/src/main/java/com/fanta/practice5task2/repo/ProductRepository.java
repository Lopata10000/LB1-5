package com.fanta.practice5task2.repo;

import com.fanta.practice5task2.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByNameAndPrice(String name, Double price, Pageable pageable);
    Page<Product> findByName(String name, Pageable pageable);
    Page<Product> findByPrice(Double price, Pageable pageable);
}
