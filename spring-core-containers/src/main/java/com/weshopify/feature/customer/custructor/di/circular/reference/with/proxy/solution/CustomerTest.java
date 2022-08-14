package com.weshopify.feature.customer.custructor.di.circular.reference.with.proxy.solution;

import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CustomerTest {
	public static void main(String[] args) {
//		Resource resource=new ClassPathResource("customer-beans-constructor-definition.for.circular.reference.problem.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("customer-beans-constructor-definition.for.circular.reference.problem.xml");
		
		HomeLoanAccount homeLoanAccount= context.getBean(HomeLoanAccount.class);
		System.out.println(homeLoanAccount.getLoanAmt()+"=="+homeLoanAccount.getLoanNumber()+"=="+homeLoanAccount.getCustomerBean().getProps());
		
//		CustomerBean customerBean=context.getBean(CustomerBean.class);
//		System.out.println("Using Constructor Injetion :"+customerBean.toString());
//		System.out.println(customerBean.hashCode());
//		Set<Object> prop = customerBean.getProps().keySet();
//		for(Object o : prop)
//		{
//			System.out.println("Object value  :"+o);
//		}
//		
////		System.out.println("Loan Amt :"+customerBean.getHomeLoanAccount().getLoanAmt() + "\nLoan Number :"+customerBean.getHomeLoanAccount().getLoanNumber());
//		
//		System.out.println(customerBean.getHomeLoanAccount().toString());
//		
//		CustomerBeanProxy proxy=new CustomerBeanProxy();
//		System.out.println(proxy.getEmail());
	}
}
