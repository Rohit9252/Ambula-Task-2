package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.ProductWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * The ProductServiceImpl class is an implementation of the ProductService interface.
 * It handles the retrieval of products from a third-party API using the RestTemplate.
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final RestTemplate restTemplate;

    /**
     * Retrieves a list of products from a third-party API using the RestTemplate.
     *
     * @return A list of Product objects containing the details of the products.
     * @throws org.springframework.web.client.RestClientException If there is an issue with the REST client.
     * @throws org.springframework.http.converter.HttpMessageNotReadableException If there is an issue with JSON deserialization.
     */
    @Override
    public List<Product> getAllProduct() {
        String url = "https://dummyjson.com/products";


        ProductWrapper productWrapper = restTemplate.getForObject(url, ProductWrapper.class);


        return Arrays.asList(productWrapper.getProducts());
    }
}
