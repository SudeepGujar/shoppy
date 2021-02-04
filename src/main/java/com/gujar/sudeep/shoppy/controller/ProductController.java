package com.gujar.sudeep.shoppy.controller;

import com.gujar.sudeep.shoppy.model.Product;
import com.gujar.sudeep.shoppy.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public PagedModel<EntityModel<Product>> getProducts(Pageable pageable, PagedResourcesAssembler<Product> pagedResourcesAssembler) {
        Page<Product> products = productService.getProducts(pageable);
        return pagedResourcesAssembler.toModel(products);
    }
}
