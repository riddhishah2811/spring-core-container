package com.weshopify.core.customized.springbeanlifecyclewithanotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.weshopify.beanlifecycle.PlatformBeansProcessor;

@Configuration
//@ComponentScan(basePackages = "com.weshopify.core.customized.springbeanlifecyclewithanotations")
public class ProductConfig {

//	@Autowired
//	private Product product;
	
	@Bean(initMethod ="init",destroyMethod = "destroy")
	public Product getProduct() {
		Product product=new Product(getOrder());
		product.setName("SBMS");
		return product;
	}
	
	@Bean
	public Order getOrder()
	{
		Order order = new Order();
		order.setOrderType("Books");
//		order.setProduct(product);
		return order;
	}
	
	@Bean
	public PlatformBeansProcessor platformBeansProcessor() {
		return new PlatformBeansProcessor();
	}
}
