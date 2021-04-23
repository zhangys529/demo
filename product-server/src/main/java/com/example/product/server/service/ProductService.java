package com.example.product.server.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public interface ProductService {
    @GetMapping("/{productId}")
    String get(@PathVariable long productId);
}
