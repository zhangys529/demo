package com.example.product.application.client.impl;

import com.example.product.application.client.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceFallback implements ProductService {
    @Override
    public String get(long productId) {
        throw new RuntimeException("product get timeout");
    }
}
