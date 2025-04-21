package com.microservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Component
@FeignClient(name = "PRODUCT")
public interface ProductClient {

    @GetMapping("/api/products")
    List<ProductDto> list();

    @GetMapping("/api/products/{id}")
    Optional<ProductDto> findById(@PathVariable(name = "id") Integer id);
}
