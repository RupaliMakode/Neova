package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WishList")
public class Wishlist {

	@Id
	@GeneratedValue
	@Column(name = "prodId")
	private int prodId;
	
	@ManyToOne
	private Product w_p_Id;
	
	@OneToOne
	private User w_u_Id;

	
	public Wishlist() {
		super();
	}


	public int getProdId() {
		return prodId;
	}


	public void setProdId(int prodId) {
		this.prodId = prodId;
	}


	public Product getW_p_Id() {
		return w_p_Id;
	}


	public void setW_p_Id(Product w_p_Id) {
		this.w_p_Id = w_p_Id;
	}


	public User getW_u_Id() {
		return w_u_Id;
	}


	public void setW_u_Id(User w_u_Id) {
		this.w_u_Id = w_u_Id;
	}


	@Override
	public String toString() {
		return "Wishlist [prodId=" + prodId + ", w_p_Id=" + w_p_Id + ", w_u_Id=" + w_u_Id + "]";
	}

	
	
}

