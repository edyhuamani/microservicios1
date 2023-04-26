package pe.com.foxdev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
	
	@GetMapping(path = "/",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> selectProduct(){
		List<String> products=new ArrayList<>();
		try {
			
		}catch(Exception ex){
			
		}
		return products;
	}
	
	@GetMapping(path = "/id",produces = MediaType.APPLICATION_JSON_VALUE)
	public String selectProductById(@RequestParam() String codeProduct){
		String product="";
		try {
			
		}catch(Exception ex){
			
		}
		return product;
	}
} 
