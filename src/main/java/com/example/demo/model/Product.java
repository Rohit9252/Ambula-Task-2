package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


/**
 * The Product class represents a product with its associated attributes.
 * It is used to deserialize JSON responses from the API.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    /**
     * The unique identifier of the product.
     */
    @JsonProperty("id")
    private Integer id;

    /**
     * The title or name of the product.
     */
    @JsonProperty("title")
    private String title;

    /**
     * A description providing more details about the product.
     */
    @JsonProperty("description")
    private String description;

    /**
     * The brand or manufacturer of the product.
     */
    @JsonProperty("brand")
    private String brand;
}
