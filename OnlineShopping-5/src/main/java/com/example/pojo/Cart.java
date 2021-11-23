package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {

	@Id
	@GeneratedValue
	@Column(name = "cartId")
	private int cartId;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "total_Cart_Price")
	private int total_Cart_Price;
	
	@ManyToOne
	private Product c_p_Id;
	
	@OneToOne
	private User c_u_Id;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal_Cart_Price() {
		return total_Cart_Price;
	}

	public void setTotal_Cart_Price(int total_Cart_Price) {
		this.total_Cart_Price = total_Cart_Price;
	}

	public Product getC_p_Id() {
		return c_p_Id;
	}

	public void setC_p_Id(Product c_p_Id) {
		this.c_p_Id = c_p_Id;
	}

	public User getC_u_Id() {
		return c_u_Id;
	}

	public void setC_u_Id(User c_u_Id) {
		this.c_u_Id = c_u_Id;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", quantity=" + quantity + ", total_Cart_Price=" + total_Cart_Price
				+ ", c_p_Id=" + c_p_Id + ", c_u_Id=" + c_u_Id + "]";
	}

	
	
}
