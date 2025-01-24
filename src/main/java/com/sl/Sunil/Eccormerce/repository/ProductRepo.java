package com.sl.Sunil.Eccormerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sl.Sunil.Eccormerce.entity.Product;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByNameContainingOrDescriptionContaining(String name, String description);
}
