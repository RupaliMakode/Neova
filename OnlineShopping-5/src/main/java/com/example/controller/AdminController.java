package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Admin;
import com.example.repo.AdminRepositoryImpl;


@RestController
@RequestMapping("/order")
public class AdminController {
	
	

		@Autowired
		AdminRepositoryImpl  adminRepo;
		
		@GetMapping("/get/{oID}")  //localhost:8080/dept/get/1
		public Admin getOrder(@PathVariable("oID") int x)
		{
			Admin admin;
			admin = adminRepo.selectAdmin(x);
			return admin;
		}
		
		@PostMapping("/add")
		public void addAdmin(@RequestBody Admin oObj)
		{
			adminRepo.insertAdmin(aObj);
		}
		
		@GetMapping("/getAll")  //localhost:8080/dept/get/1
		public List <Order> getOrders()
		{
			List <Order> orderList;
			orderList = adminRepo.selectOrders();
			return orderList;
		}
		
		@PutMapping("/update")
		public void updateOrder(@RequestBody Order oID)
		{
			adminRepo.updateOrder(oID);
		}
		
		@PutMapping("/delete/{oID}")
		public void deleteOrder(@PathVariable("oID") int x)
		{
			adminRepo.deleteOrder(x);
		}
}
