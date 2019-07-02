package com.example.ecsitedeveloplearning.ec.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

//Databaseの Categoriesテーブルと連携するため Entity設定必要

@Data
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
	public Category(int category, String name) {
		super();
	}
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "name")
	private String name;
}
