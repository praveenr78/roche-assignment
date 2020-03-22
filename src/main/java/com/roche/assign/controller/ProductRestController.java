package com.roche.assign.controller;

import com.roche.assign.model.Product;
import com.roche.assign.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 *
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/products")
@Slf4j
public class ProductRestController {

    private ProductService productService;

    /**
     * @return
     */
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    /**
     * @param sku
     * @return
     */
    @GetMapping("/{sku}")
    public ResponseEntity<Product> findById(@PathVariable String sku) {
        Optional<Product> product = productService.findBySku(sku);
        if (!product.isPresent()) {
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(product.get());
    }

    /**
     * @param product
     * @return
     */
    @PostMapping
    public ResponseEntity<Product> create(@Valid @RequestBody Product product) {
        return ResponseEntity.ok(productService.create(product).get());
    }

    /**
     * @param sku
     * @param product
     * @return
     */
    @PutMapping("/{sku}")
    public ResponseEntity<Product> update(@PathVariable String sku, @Valid @RequestBody Product product) {
        Optional<Product> update = productService.update(sku, product);
        if (!update.isPresent()) {
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(update.get());
    }

    /**
     * @param sku
     * @return
     */
    @DeleteMapping("/{sku}")
    public ResponseEntity delete(@PathVariable String sku) {
        Optional<Product> delete = productService.findBySku(sku);
        if (!delete.isPresent()) {
            ResponseEntity.badRequest().build();
        }
        productService.deleteBySku(delete.get());
        return ResponseEntity.ok().build();
    }
}
