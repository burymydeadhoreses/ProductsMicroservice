package io.github.burymydeadhoreses.productsmicroservice.services;

import io.github.burymydeadhoreses.productsmicroservice.entities.Product;
import io.github.burymydeadhoreses.productsmicroservice.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> list() {
        return productRepository.findAll();
    }

    public void add(Product product) {
        productRepository.save(product);
    }

    public void delete(UUID id) {
        productRepository.deleteById(id);
    }
}
