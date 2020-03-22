package com.roche.assign.repositories;

import com.roche.assign.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    @Override
    @Query("{ 'isActive' : true }")
    List<Product> findAll();

    @Query("{ 'isActive' : true, 'sku' : ?0 }")
    Optional<Product> findBySku(String s);


}
