package com.example.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "userId")
	private int userId;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "mobileNumber")
	private long mobileNumber;
	
	@Column(name = "address")
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "w_u_Id")
	private Wishlist u_w_Id;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "o_u_Id")
	private Set<Order> u_o_Id;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "c_u_Id")
	private Cart u_c_Id;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Wishlist getU_w_Id() {
		return u_w_Id;
	}

	public void setU_w_Id(Wishlist u_w_Id) {
		this.u_w_Id = u_w_Id;
	}

	public Set<Order> getU_o_Id() {
		return u_o_Id;
	}

	public void setU_o_Id(Set<Order> u_o_Id) {
		this.u_o_Id = u_o_Id;
	}

	public Cart getU_c_Id() {
		return u_c_Id;
	}

	public void setU_c_Id(Cart u_c_Id) {
		this.u_c_Id = u_c_Id;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", u_w_Id=" + u_w_Id + ", u_o_Id="
				+ u_o_Id + ", u_c_Id=" + u_c_Id + "]";
	}
	
	
	
}
