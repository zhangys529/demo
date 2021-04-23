package com.example.product.server.service.impl;

import com.example.product.server.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public String get(long productId) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            log.error("Exception:", e);
        }
        return String.valueOf(productId);
    }
}
