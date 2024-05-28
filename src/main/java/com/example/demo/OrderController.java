package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired OrderService os;
	@PostMapping("/post")
	public String save(@RequestBody OrderEntity e) {
		return os.save(e);
	}
	@GetMapping("/getvalue")
	public List<Object> getall() {
     return os.getall();
}
}
