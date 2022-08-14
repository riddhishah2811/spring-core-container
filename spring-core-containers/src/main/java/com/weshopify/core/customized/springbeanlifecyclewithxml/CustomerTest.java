package com.weshopify.core.customized.springbeanlifecyclewithxml;

import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CustomerTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("customer-beans-constructor-definition-springbeanlifecyclewithxml.xml");
		System.out.println("===============Object Created inside the core container Start================");
		CustomerBean customerBean=context.getBean(CustomerBean.class);
		System.out.println(customerBean.getEmail());
		System.out.println(customerBean.getHomeLoanAccount().getLoanAmt());
		System.out.println("===============Object Created inside the core container End================");
		
		((ConfigurableApplicationContext)context).close();
		
//		Try to access the closed bean after calling destroy method
		CustomerBean customerBean1=context.getBean(CustomerBean.class);
		System.out.println(customerBean1.getEmail());
		
//		HomeLoanAccount hla=customerBean.getHomeLoanAccount();
		
	}
}
