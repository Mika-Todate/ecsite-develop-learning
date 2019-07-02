package com.example.ecsitedeveloplearning.ec.shop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Data
@Entity
@Table(name = "products")

// Databaseの Productsテーブルと連携するため Entity設定必要

public class Product {
	
	@Id
	public void setName(String name) {
		this.name = name;
	}

	public void setCategoryId(Category category) {
		this.categoryId = category;	
	}

	public void setPrice(int price) {
		this.price = price;	
	}

	public void setDescription(String description) {
		this.description = description;	
	}
	
	public void setId(long productId) {
		this.id = productId;	
	}
	
	public long getId() {
		return id;
	}
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public String getImagePath() {
		return null;
	}
	
	@Column(name = "id")
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	
	@JoinColumn(name = "category_id")
	private Category categoryId;
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image_path")
	private String imagePath;
	
		@Temporal(TemporalType.TIMESTAMP)
	
	@Column(name = "created",nullable = false)
		private Date created;
		
		@Temporal(TemporalType.TIMESTAMP)
	
	@Column(name = "updated",nullable = true)
		private Date updated;

		
		//ShopServiceのget();のエラーをなくすため
		public Product get() {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}



}
