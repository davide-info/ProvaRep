package controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import config.MyConfig;
import model.Product;
import repositories.ProductRepository;

@Controller
@ResponseBody
public class ProvaController {

	
	
@RequestMapping("/hello")
public String hello() {return "hello";}

@RequestMapping("/prova")

public List<Product> getProducts() {
	List<Product > products = Collections.emptyList();
	try(var context = new AnnotationConfigApplicationContext(MyConfig.class)) {
			var repository =context.getBean(ProductRepository.class);
			products = repository.getProducts();
				
		}catch(Exception ex) {
			
		}
	return products;
	}
	
	
 }