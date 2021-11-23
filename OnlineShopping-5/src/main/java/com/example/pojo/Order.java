package com.example.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Order")
public class Order {

	@Id
	@GeneratedValue
	@Column(name = "orderId")
	private int orderId;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "date")
	private LocalDate localDate;
	
	@Column(name = "total_Order_Price")
	private int total_Order_Price;
	
	@ManyToOne
	private User o_u_Id;

	@ManyToOne
	private Product o_p_Id;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public int getTotal_Order_Price() {
		return total_Order_Price;
	}

	public void setTotal_Order_Price(int total_Order_Price) {
		this.total_Order_Price = total_Order_Price;
	}

	public User getO_u_Id() {
		return o_u_Id;
	}

	public void setO_u_Id(User o_u_Id) {
		this.o_u_Id = o_u_Id;
	}

	public Product getO_p_Id() {
		return o_p_Id;
	}

	public void setO_p_Id(Product o_p_Id) {
		this.o_p_Id = o_p_Id;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", quantity=" + quantity + ", localDate=" + localDate
				+ ", total_Order_Price=" + total_Order_Price + ", o_u_Id=" + o_u_Id + ", o_p_Id=" + o_p_Id + "]";
	}
	
	
}
