package com.study.codejavacrud.repo;

import com.study.codejavacrud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
