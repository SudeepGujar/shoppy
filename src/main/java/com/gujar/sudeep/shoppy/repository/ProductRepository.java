package com.gujar.sudeep.shoppy.repository;

import com.gujar.sudeep.shoppy.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    @Override
    Page<Product> findAll(Pageable pageable);
}
