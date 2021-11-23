package com.example.repo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.pojo.User;

@Repository
public class UserRepositoryImpl extends BaseRepository implements UserRepository {

	
	
	
	@Transactional
	public void insertUser(User uObj) {
		super.persist(uObj);
		System.out.println("User inserted...");

	}

	@Override
	public User selectUser(int uID) {
		System.out.println("UserRepositoryImpl : selecting User by uID");
		User user = super.find(User.class, uID);

		return user;
	}

	@Override
	public List<User> selectUsers() {
		List<User>  userList = new ArrayList<User>();

		System.out.println("UserRepositoryImpl : Selecting all Users...");
		return super.findAll("User");

	}

	@Transactional
	public void updateUser(User uID) {
		System.out.println("UserRepositoryImpl : Updating User...");
		super.merge(uID);

	}

	@Transactional
	public void deleteUser(int uID) {
		System.out.println("UserRepositoryImpl : Deleting User");
		super.remove(User.class, uID);

	}

}
