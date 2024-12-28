package com.mohancode.cart.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.management.ConstructorParameters;
import java.util.List;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String description;
    private double rating;
    private String category;
    private String seller;
    private int stock;
    private int numOfReviews;

    @ElementCollection
    @Column(name = "image_url")
    private List<String> images;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getNumOfReviews() {
        return numOfReviews;
    }

    public void setNumOfReviews(int numOfReviews) {
        this.numOfReviews = numOfReviews;
    }

    public Product() {
        super();
    }

    public Product(String name, double price, String description, double rating,
                   String category, String seller, int stock, int numOfReviews) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
        this.category = category;
        this.seller = seller;
        this.stock = stock;
        this.numOfReviews = numOfReviews;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", category='" + category + '\'' +
                ", seller='" + seller + '\'' +
                ", stock=" + stock +
                ", numOfReviews=" + numOfReviews +
                '}';
    }
}
