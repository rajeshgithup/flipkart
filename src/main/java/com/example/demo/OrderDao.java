package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	@Autowired OrderRepository or;
	public String save(OrderEntity e) {
		or.save(e);
		return "order saved";
	}
	public List<Object> getall() {
	     return or.getall();
	}
}
