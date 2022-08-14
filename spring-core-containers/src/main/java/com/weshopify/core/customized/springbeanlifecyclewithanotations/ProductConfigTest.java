package com.weshopify.core.customized.springbeanlifecyclewithanotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductConfigTest {

	public static void main(String[] args) {
		
		
		
		
//		ApplicationContext context=new AnnotationConfigApplicationContext(ProductConfig.class);
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProductConfig.class);

		Product product= context.getBean(Product.class);
		System.out.println(product.hashCode());
		System.out.println("Order hashcode in product is :"+product.getOrder().hashCode());
		((ConfigurableApplicationContext)context).close();
		
		
//		Product product1= context.getBean(Product.class);
//		System.out.println(product1.hashCode());
		
//		Order o1=context.getBean(Order.class);
//		System.out.println(o1.hashCode());
//		System.out.println(o1.getProduct().hashCode());
//		
//		Order o2=context.getBean(Order.class);
//		System.out.println(o2.hashCode());
//		System.out.println(o2.getProduct().hashCode());
	}

}
