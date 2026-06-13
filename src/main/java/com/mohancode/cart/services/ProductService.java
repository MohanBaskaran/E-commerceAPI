package com.mohancode.cart.services;

import com.mohancode.cart.models.Product;
import com.mohancode.cart.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	
	 private UserService userService;
	   private EmailService emailService;
	   

	   @Autowired
	   public ProductService(UserService userService) {
	      this.userService = userService;
	   }

	   public ProductService(UserService userService, EmailService emailService) {
	      this.userService = userService;
	      this.emailService = emailService;
	   }
	
	

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        //System.out.println("Products fetched: " + products.toString()); // Log products
        return products;
    }


}
