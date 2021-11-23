package com.example.repo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.example.pojo.Admin;
import com.example.pojo.Cart;




public class CartRepositoryImpl extends BaseRepository implements CartRepository {
	
	@Transactional
	public void insertCart(Cart cObj) {
		super.persist(cObj);
		System.out.println("Cart inserted...");
		
	}

	

	@Override
	public Cart selectCart(int cID) {
		System.out.println("CartRepositoryImpl : selecting Cart by cID");
		Cart cart = super.find(Cart.class, cID);

		return cart;
	}

	@Override
	public List<Cart> selectCarts() {
		List<Cart>  cartList = new ArrayList<Cart>();

		System.out.println("CartRepositoryImpl : Selecting all Carts...");
		return super.findAll("Cart");
	}

	@Override
	public void updateCart(Cart cID) {
		super.merge(cID);
		System.out.println("CartRepositoryImpl : Updating Cart...");

	}

	@Override
	public void deleteCart(int cID) {
		super.remove(Cart.class, cID);
		System.out.println("CartRepositoryImpl : Deleting Cart");

	}

}
	
	


