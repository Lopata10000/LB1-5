package com.fanta.practical2task2.repository;

import com.fanta.practical2task2.model.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductRepository {
    private final Map<Long, Product> productMap = new HashMap<>();

    @PostConstruct
    public void initialize() {
        // Додати 5 прикладів товарів
        saveOrUpdate(new Product(1L, "Товар 1", new BigDecimal("10.00")));
        saveOrUpdate(new Product(2L, "Товар 2", new BigDecimal("20.00")));
        saveOrUpdate(new Product(3L, "Товар 3", new BigDecimal("30.00")));
        saveOrUpdate(new Product(4L, "Товар 4", new BigDecimal("40.00")));
        saveOrUpdate(new Product(5L, "Товар 5", new BigDecimal("50.00")));
    }

    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    public void saveOrUpdate(Product product) {
        productMap.put(product.getId(), product);
    }

    public Product findById(Long id) {
        return productMap.get(id);
    }

    public void deleteById(Long id) {
        productMap.remove(id);
    }
}
