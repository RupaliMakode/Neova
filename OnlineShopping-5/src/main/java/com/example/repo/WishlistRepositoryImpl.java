package com.example.repo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.pojo.User;
import com.example.pojo.Wishlist;
@Repository
public class WishlistRepositoryImpl extends BaseRepository implements WishlistRepository {

	
	
	@Transactional
	public void insertWishlist(Wishlist wObj) {
		super.persist(wObj);
		System.out.println("Wishlist inserted...");

	}

	@Override
	public Wishlist selectWishlist(int wID) {
		System.out.println("WishlistRepositoryImpl : selecting Wishlist by wID");
		Wishlist wishlist = super.find(Wishlist.class, wID);

		return wishlist;
	}

	@Override
	public List<Wishlist> selectWishlists() {
		List<Wishlist>  wishlistList = new ArrayList<Wishlist>();

		System.out.println("WishlistRepositoryImpl : Selecting all Wishlists...");
		return super.findAll("Wishlist");
	}

	@Override
	public void updateWishlist(Wishlist wID) {
		super.merge(wID);
		System.out.println("WishlistRepositoryImpl : Updating Wishlist...");
		
	}

	@Override
	public void deleteWishlist(int wID) {
		super.remove(Wishlist.class, wID);
		System.out.println("WishlistRepositoryImpl : Deleting Wishlist");
		
	}

}
