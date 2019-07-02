package com.example.ecsitedeveloplearning.ec.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.ecsitedeveloplearning.ec.shop.model.Category;

public interface CategoryRepository {

	@Query
	List<Category> findAll();

}
