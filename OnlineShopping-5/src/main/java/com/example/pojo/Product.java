package com.example.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "stock_Remaining")
	private int stock_Remaining;
	
	@ManyToOne
	private Set<Retailer> p_r_Id;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "o_p_Id")
	private Set<Order> p_o_Id;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "c_p_Id")
	private Set<Cart> p_c_Id;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "w_p_Id")
	private Set<Wishlist> P_w_Id;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStock_Remaining() {
		return stock_Remaining;
	}

	public void setStock_Remaining(int stock_Remaining) {
		this.stock_Remaining = stock_Remaining;
	}

	public Set<Retailer> getP_r_Id() {
		return p_r_Id;
	}

	public void setP_r_Id(Set<Retailer> p_r_Id) {
		this.p_r_Id = p_r_Id;
	}

	public Set<Order> getP_o_Id() {
		return p_o_Id;
	}

	public void setP_o_Id(Set<Order> p_o_Id) {
		this.p_o_Id = p_o_Id;
	}

	public Set<Cart> getP_c_Id() {
		return p_c_Id;
	}

	public void setP_c_Id(Set<Cart> p_c_Id) {
		this.p_c_Id = p_c_Id;
	}

	public Set<Wishlist> getP_w_Id() {
		return P_w_Id;
	}

	public void setP_w_Id(Set<Wishlist> p_w_Id) {
		P_w_Id = p_w_Id;
	}

	@Override
	public String toString() {
		return "Product [userId=" + userId + ", price=" + price + ", image=" + image + ", description=" + description
				+ ", brand=" + brand + ", stock_Remaining=" + stock_Remaining + ", p_r_Id=" + p_r_Id + ", p_o_Id="
				+ p_o_Id + ", p_c_Id=" + p_c_Id + ", P_w_Id=" + P_w_Id + "]";
	}

	

}
