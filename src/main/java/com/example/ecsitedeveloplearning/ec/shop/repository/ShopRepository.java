package com.example.ecsitedeveloplearning.ec.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ecsitedeveloplearning.ec.account.model.Account;
import com.example.ecsitedeveloplearning.ec.shop.model.Category;
import com.example.ecsitedeveloplearning.ec.shop.model.Product;

interface ShopRepository extends JpaRepository<Account,Long>{
	
	// ここはDBに Access するためのRepositoryです。
	// JPAを extendsして設定する必要があります。
	
	@Query("SELECT * FROM　categories")
	List<Category>categories();
	
	@Query("SELECT * FROM　products")
	List<Product>products();
}
