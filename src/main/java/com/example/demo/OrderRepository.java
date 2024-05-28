package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
	@Query(value="Select pincode,product_name from flibkartorder inner join flibkartproduct on flibkartorder.id=flibkartproduct.order_fkey",nativeQuery=true)
	public List<Object> getall();



}

