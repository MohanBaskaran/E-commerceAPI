package com.mohancode.cart.controller;

import com.mohancode.cart.models.Product;
import com.mohancode.cart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private  ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        List<Product> products = productService.getAllProducts();
       // System.out.println("Returning products: " + products);
        return products;
    }

//    @RequestMapping("/categories")
//    public List<Map<String,Object>> getcategories() {
//
//        return Arrays.asList(
//                Map.of("name","categories 1","price",123),
//                Map.of("name","categories 2","price",456)
//        );
//
//    }
}
