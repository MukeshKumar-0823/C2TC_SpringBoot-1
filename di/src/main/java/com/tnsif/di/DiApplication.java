package com.tnsif.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(DiApplication.class, args);
	    customer1 c1=var.getBean(customer1.class);
	    c1.show();
	    customer2 c2=var.getBean(customer2.class);
	    c2.show();
	    customer3 c3=var.getBean(customer3.class);
	    c3.show();
	
	}

}
