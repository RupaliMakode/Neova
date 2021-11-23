package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.User;

public interface UserRepository  // extends JpaRepository<User, Integer> {
{
	
	void insertUser(User uObj); //C

	User selectUser(int uID); //R
	List<User> selectUsers(); //RA

	void updateUser(User uID); //U
	void deleteUser(int uID); //D
	
	
	//-----------------------//
	
	
}
