package com.weshopify.core.customized.springbeanlifecyclewithanotations;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Product implements ApplicationContextAware,BeanNameAware{
	private int productId;
	private String name;
	private String beanName=null;
	
	public Product() {
		System.out.println("Product is creating !! ");
	}
	
	Order order;
	
	@Autowired
	public Product(Order order)
	{
		this();
		System.out.println("Order is injecting through constructor!");
		this.order=order;
	}
	
	public Order getOrder() {
		return order;
	}

	public int getProductId() { 
		return productId;
	}
	public void setProductId(int productId) {
		System.out.println("ProductId is injecting through setter!");
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("ProductName is injecting through setter!");
		this.name = name;
	}
	
	public void init() throws Exception {
		System.out.println("\n==========================Custom Initializing Method 'After Property Set' Start=========================================");
		System.out.println("Call after injection and just before the bean creation container");
		System.out.println("==========================Custom Initializing Method 'After Property Set' End=========================================\n");
	}

	public void destroy() throws Exception {
		System.out.println("================Custom Destroy Method Start======================");
		System.out.println("Call before the spring bean is destroyed!");
		System.out.println("================Custom Destroy Method End======================");
	}

	@Override
	public void setBeanName(String name) {
		this.beanName=name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("-------------------Note : It is note the good practice to se the AwareInterface!!---------------------");
		System.out.println("=====================Application Aware Inteface Start ====================================");
		boolean isBeanDefined = applicationContext.containsBeanDefinition(beanName);
		System.out.println("Is Bean Definition there ? :"+isBeanDefined);
		boolean isBeanthereInContainer = applicationContext.containsBean(beanName);
		System.out.println("Is Bean there in container ? :"+isBeanthereInContainer);
		int beanDefCnt = ((ConfigurableApplicationContext)applicationContext).getBeanDefinitionCount();
		System.out.println("Number of bean definition cnt :"+beanDefCnt);
		System.out.println("=====================Application Aware Inteface End ====================================");
	}
	
}
