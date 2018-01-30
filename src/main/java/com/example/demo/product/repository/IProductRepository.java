package com.example.demo.product.repository;

import com.example.demo.product.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product, Long> {
}
