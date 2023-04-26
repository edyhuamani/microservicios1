package pe.com.foxdev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.foxdev.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public List<String> selectAll(){
		List<String> customers=new ArrayList<>();
		try {
			
		}catch(Exception ex) {
			
		}
		return customers;
	}
}
