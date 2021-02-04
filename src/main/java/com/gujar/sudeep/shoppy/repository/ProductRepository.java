package com.gujar.sudeep.shoppy.repository;

import com.gujar.sudeep.shoppy.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    @Override
    Page<Product> findAll(Pageable pageable);
}
