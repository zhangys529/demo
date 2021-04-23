package com.example.product.application.client;

import com.example.product.application.client.impl.ProductServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "product-server", path = "/product", fallback = ProductServiceFallback.class)
public interface ProductService {
    @GetMapping("/{productId}")
    String get(@PathVariable long productId);
}
