package com.weshopify.core.customized.springbeanlifecyclewithxml;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.weshopify.core.customized.springbeanlifecyclewithxml.HomeLoanAccount;
// InitializingBean is used for custom initialization 
//DisposableBean is used for custom destroy()
//public class CustomerBean implements Serializable, InitializingBean,DisposableBean {

//Spring is a non-invasive method(Not any burden) to any framework
//We can also control the lifecycle of spring bean without InitilizationBean, DisposibleBean 
public class CustomerBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String email;
	
	private HomeLoanAccount homeLoanAccount;
	
	public CustomerBean() {
		System.out.println("============Instatiation Start===================");
		System.out.println("CustomerBean is instantialted !!\n");
	}
//	 Always remember constructor injection is having a higher priority than the setter injection because once the bean is instatiated the constructor injection is happening.
	public CustomerBean(HomeLoanAccount homeLoanAccount) {
		this();// To call the default constructor for current class where as the super() call the immediate parent class constructor 
		System.out.println("================SetState- Injecting the dependencies======================");
		System.out.println("injecting the homeloan acc through constructor!");
		this.homeLoanAccount=homeLoanAccount;
		
	}
		
	public HomeLoanAccount getHomeLoanAccount() {
		return homeLoanAccount;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		System.out.println("Injecting the email through setters!");
		this.email = email;
	}
	
	
//	We can use any method names into the init-method & destroy-method field of xml.
//	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("\n==========================Custom Initializing Method 'After Property Set' Start=========================================");
		System.out.println("Call after injection and just before the bean creation container");
		System.out.println("==========================Custom Initializing Method 'After Property Set' End=========================================\n");
	}
//	@Override
	public void destroy() throws Exception {
		System.out.println("================Custom Destroy Method Start======================");
		System.out.println("Call before the spring bean is destroyed!");
		System.out.println("================Custom Destroy Method End======================");
	}
}
