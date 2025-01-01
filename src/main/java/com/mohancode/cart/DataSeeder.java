package com.mohancode.cart;

import com.mohancode.cart.models.Product;
import com.mohancode.cart.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder
       // implements CommandLineRunner
{

  /*  @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        if(productRepository.count() == 0) {

            List<Product> products = Arrays.asList(
                    new Product("Smartphone", 699.99, "High-performance smartphone with 128GB storage",
                            4.5, "Electronics", "TechStore", 50, 1200,Arrays.asList("https://picsum.photos/200/300","https://picsum.photos/200/300")),

                    new Product("Laptop", 1199.99, "Lightweight laptop with 16GB RAM and 512GB SSD",
                            4.7, "Computers", "BestDeals", 30, 850,Arrays.asList("https://picsum.photos/200/300","https://picsum.photos/200/300")),

                    new Product("Wireless Earbuds", 49.99, "Comfortable wireless earbuds with noise cancellation",
                            4.3, "Accessories", "AudioWorld", 150, 5000,Arrays.asList("https://picsum.photos/200/300","https://picsum.photos/200/300")),

                    new Product("Gaming Console", 499.99, "Next-gen gaming console with ultra HD graphics",
                            4.8, "Gaming", "GameHub", 20, 2000,Arrays.asList("https://picsum.photos/200/300","https://picsum.photos/200/300")),

                    new Product("Smartwatch", 199.99, "Stylish smartwatch with fitness tracking features",
                            4.4, "Wearables", "GadgetCorner", 75, 3200,Arrays.asList("https://picsum.photos/200/300","https://picsum.photos/200/300"))
            );

            productRepository.saveAll(products);
            System.out.println("Demo data inserted");

        }
    }*/
}
