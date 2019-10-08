package com.study.codejavacrud.service;

import com.study.codejavacrud.model.Product;
import com.study.codejavacrud.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll(){
        return productRepository.findAll();
    }

    public void save(Product product){
        productRepository.save(product);
    }

    public Product get(long id){
        return productRepository.findById(id).get();
    }

    public void delete(long id){
        productRepository.deleteById(id);
    }


}
