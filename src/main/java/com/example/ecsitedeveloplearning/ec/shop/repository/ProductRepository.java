package com.example.ecsitedeveloplearning.ec.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.ecsitedeveloplearning.ec.shop.model.Category;
import com.example.ecsitedeveloplearning.ec.shop.model.Product;

public interface ProductRepository {

	@Query
	List<Product> findAll();

	void save(Product product);

	Product findById(long productId);

	void deleteById(long productId);

	List<Product> findByCategoryId(Category category);

}
