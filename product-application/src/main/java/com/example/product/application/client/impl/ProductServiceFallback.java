package com.example.product.application.client.impl;

import com.example.product.application.client.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProductServiceFallback implements ProductService {
    @Override
    public String get(long productId) {
        log.error("product get timeout productId={}", productId);
        return "product get timeout";
    }
}
