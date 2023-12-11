package com.fanta1.repo;

import com.fanta1.model.Product;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ProductRepository {
    private static List<Product> productList = new CopyOnWriteArrayList<>();

    static {
        productList.add(new Product(1, "Манга", 10.99));
        productList.add(new Product(2, "Хаорі", 19.99));
    }

    public static List<Product> getProducts() {
        return productList;
    }

    public static synchronized void addProduct(Product product) {
        productList.add(product);
    }
}
