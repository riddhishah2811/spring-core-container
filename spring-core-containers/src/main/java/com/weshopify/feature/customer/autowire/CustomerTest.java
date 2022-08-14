package com.weshopify.feature.customer.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CustomerTest {
	public static void main(String[] args) {
//		===============================================================Start autowiring with ref and attribute==========================================================
		/*Resource resource=new ClassPathResource("customer-beans-parameterized-definition-autowire.xml");
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
		
		HomeLoanAccount homeLoanAccount= customerBean.getHomeLoanAccount();
		System.out.println(homeLoanAccount.getLoanAmt());
		
//		HomeLoanAccount hla= factory.getBean(HomeLoanAccount.class);
//		System.out.println(hla.getLoanAmt());
//		System.out.println(hla.hashCode());
//		===================================================End autowiring with ref and attribute===============================================
		*/
//		==============================================Start autowiring with @Autowired=================================================
		
//		If we want to use annotation in the .xml file we have to enable the annotation into the .xml file.For that we have to add the  context xmlns
		ApplicationContext context=new ClassPathXmlApplicationContext("customer-beans-parameterized-definition-autowire.xml");
		
//		HomeLoanAccount homeLoanAccount= (HomeLoanAccount)context.getBean("homeLoanAccount",HomeLoanAccount.class);
//		System.out.println(homeLoanAccount.getLoanAmt());
		CustomerBean customerBean= context.getBean(CustomerBean.class);
		System.out.println(customerBean.getHomeLoanAccount().getLoanAmt());
		
		
//		=============================================End autowiring with @Autowired=========================================================
	}

}
