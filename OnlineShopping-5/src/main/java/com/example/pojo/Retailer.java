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
@Table(name = "Retailer")
public class Retailer {
	
	@Id
	@GeneratedValue
	@Column(name = "retailerId")
	private int retailerId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "mobileNumber")
	private long mobileNumber;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "p_r_Id")
	private Set<Product> r_p_Id;
	
	@ManyToOne
	private Admin r_a_Id;

	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Set<Product> getR_p_Id() {
		return r_p_Id;
	}

	public void setR_p_Id(Set<Product> r_p_Id) {
		this.r_p_Id = r_p_Id;
	}

	public Admin getR_a_Id() {
		return r_a_Id;
	}

	public void setR_a_Id(Admin r_a_Id) {
		this.r_a_Id = r_a_Id;
	}

	@Override
	public String toString() {
		return "Retailer [retailerId=" + retailerId + ", name=" + name + ", password=" + password + ", mobileNumber="
				+ mobileNumber + ", r_p_Id=" + r_p_Id + ", r_a_Id=" + r_a_Id + "]";
	}
	
	
}
