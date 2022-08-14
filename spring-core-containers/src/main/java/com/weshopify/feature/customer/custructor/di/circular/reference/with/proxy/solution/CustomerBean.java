package com.weshopify.feature.customer.custructor.di.circular.reference.with.proxy.solution;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.weshopify.feature.customer.custructor.di.circular.reference.with.proxy.solution.HomeLoanAccount;

public class CustomerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNo;
	List<String> accounts;
	Set<String> loanTypes;
	Map<String,String> loanCodes;
	Properties props;
	
	private HomeLoanAccount homeLoanAccount;
	
	public CustomerBean(int id, String firstName, String lastName, String email, String mobileNo,List<String> accounts,Set<String> loanTypes,Map<String,String> loanCodes,Properties props,HomeLoanAccount homeLoanAccount) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.accounts=accounts;
		this.loanTypes=loanTypes;
		this.loanCodes=loanCodes;
		this.props=props;
		this.homeLoanAccount=homeLoanAccount;
	}

	public Properties getProps() {
		return props;
	}

	
	public HomeLoanAccount getHomeLoanAccount() {
		return homeLoanAccount;
	}

	@Override
	public String toString() {
		return "CustomerBean [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", accounts=" + accounts + ", loanTypes=" + loanTypes + ", loanCodes="
				+ loanCodes + ", props=" + props + "]";
	}

	

	

	


	

	
}
