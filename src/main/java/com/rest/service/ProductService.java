package com.rest.service;


import com.rest.entity.Category;
import com.rest.entity.Product;

import java.util.List;

public interface ProductService {

    Product persist(Product product);

    List<Product> findAll();

    List<Product> findByCategory(Category category);

    List<Product> findLike();

    Product findById(Long id);

    Product merge(Product product);

    void remove(Long id);

}
