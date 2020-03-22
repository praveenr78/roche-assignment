package com.roche.assign.service;

import com.roche.assign.model.Product;
import com.roche.assign.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 */
@Service
@AllArgsConstructor
@Slf4j
public class ProductService {

    private ProductRepository productRepository;

    /**
     * @param product
     * @return
     */
    public Optional<Product> create(final Product product) {
        return Optional.of(productRepository.insert(product));
    }

    /**
     * @return
     */
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    /**
     * @param sku
     * @return
     */
    public Optional<Product> findBySku(final String sku) {
        return productRepository.findBySku(sku);
    }

    /**
     * @param sku
     * @param product
     * @return
     */
    public Optional<Product> update(final String sku, final Product product) {
        Optional<Product> match = productRepository.findBySku(sku);
        if (!Optional.of(match).isPresent()) {
            return Optional.empty();
        }

        Product foundProd = match.get();
        foundProd.setName(product.getName());
        foundProd.setPrice(product.getPrice());

        return Optional.of(productRepository.save(foundProd));
    }

    /**
     * @param product
     */
    public void deleteBySku(final Product product) {
        product.setIsActive(Boolean.FALSE);
        productRepository.save(product);
    }
}
