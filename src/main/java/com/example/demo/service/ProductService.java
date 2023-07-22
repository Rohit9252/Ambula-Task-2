package com.example.demo.service;

import com.example.demo.model.Product;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProduct() throws JsonProcessingException;

}
