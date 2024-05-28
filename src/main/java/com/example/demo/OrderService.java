package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired OrderDao od;
	public String save(OrderEntity e) {
		return od.save(e);
	}
	public List<Object> getall() {
	     return od.getall();
}
}
