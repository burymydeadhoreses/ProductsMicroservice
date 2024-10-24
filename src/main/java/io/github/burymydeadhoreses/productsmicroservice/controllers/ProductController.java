package io.github.burymydeadhoreses.productsmicroservice.controllers;

import io.github.burymydeadhoreses.productsmicroservice.entities.Product;
import io.github.burymydeadhoreses.productsmicroservice.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> list() {
        return productService.list();
    }

    @PostMapping
    public void add(@RequestBody Product product) {
        productService.add(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        productService.delete(id);
    }
}
