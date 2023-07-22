package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductController {
    @Autowired
     private ProductServiceImpl productService;
    /**
     * Endpoint to retrieve a list of products.
     *
     * @return ResponseEntity containing the list of Product objects and HttpStatus.OK if successful.
     */

    //url = "http://localhost:8080/products"
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProduct() {


        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);

    }



}
