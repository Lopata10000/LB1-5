package com.fanta.practical2task2.service;

import com.fanta.practical2task2.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductList();

    void saveOrUpdate(Product product);

    Product getProductById(Long id);

    void deleteById(Long id);
}