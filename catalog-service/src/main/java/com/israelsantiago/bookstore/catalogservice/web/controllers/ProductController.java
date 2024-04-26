package com.israelsantiago.bookstore.catalogservice.web.controllers;

import com.israelsantiago.bookstore.catalogservice.domain.PagedResult;
import com.israelsantiago.bookstore.catalogservice.domain.Product;
import com.israelsantiago.bookstore.catalogservice.domain.ProductNotFoundException;
import com.israelsantiago.bookstore.catalogservice.domain.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    PagedResult<Product> getProducts(@RequestParam(name = "page", defaultValue = "1") int pageNo) {
        return productService.getProducts(pageNo);
    }

    @GetMapping("/{code}")
    ResponseEntity<Product> getProductByCode(@PathVariable String code) {
        return productService
                .getProductByCode(code)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> ProductNotFoundException.forCode(code));
    }
}
