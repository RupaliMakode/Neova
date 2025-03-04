package com.example.repo;

import java.util.List;

import com.example.pojo.Order;

public interface OrderRepository {

	void insertOrder(Order oObj); //C

	Order selectOrder(int oID); //R
	List<Order> selectOrders(); //RA

	void updateOrder(Order oID); //U
	
	void deleteOrder(int oID); //D
}
