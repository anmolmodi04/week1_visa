package com.visa.prj.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.entity.Product;
import com.visa.prj.service.OrderService;

public class OrderClient {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	ctx.scan("com.visa");
	ctx.refresh();
	
	String[] names = ctx.getBeanDefinitionNames();
	for (String name : names) {
		System.out.println(name);
	}
	
	OrderService service = ctx.getBean("orderService", OrderService.class);
	Product p = new Product(0,"Camlin Whiteboard Marker", "stationary",120,500);
//	service.addProduct(p);
	
	List<Product> products = service.getProducts();
	for (Product prd : products) {
		System.out.println(prd.getName() + "," + prd.getPrice());
	}
	}

}
