package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductWrapper {
    @JsonProperty("products")
    private Product[] products;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
