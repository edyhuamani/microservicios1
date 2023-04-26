package pe.com.foxdev.orders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.com.foxdev.orders.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping(path="/id")
	public String selectOrderById(@RequestParam() String orderId) {
		String order="";
		try {
			
		}catch(Exception ex) {
			
		}
		return order;
	}
}
