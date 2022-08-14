package com.weshopify.feature.customer.parameterized.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CustomerTest {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("customer-beans-parameterized-definition.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		CustomerBean customerBean=factory.getBean(CustomerBean.class);
		System.out.println(customerBean);
		System.out.println(customerBean.hashCode());
		System.out.println(customerBean.getLoanList());
		System.out.println(customerBean.getAccSet());
		System.out.println(customerBean.getCustData().entrySet());
		System.out.println(customerBean.getAditionalInfo().entrySet());
//		For Below lambda function JRE needs to be in 1.8 version. 
//		customerBean.getAditionalInfo().entrySet().forEach(entry->{
//			System.out.println(entry.getKey()+"=="+entry.getValue());
//		});
		System.out.println("HomeLoan Amount :"+customerBean.getHomeLoanAccount().getLoanAmt());
		HomeLoanAccount hla= factory.getBean(HomeLoanAccount.class);
		System.out.println(hla.getLoanAmt());
		System.out.println(hla.hashCode());
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("customer-beans-definition.xml");
		
	}

}
