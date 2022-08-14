package com.weshopify.feature.customer.parameterized.di;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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
	
	public HomeLoanAccount getHomeLoanAccount() {
		return homeLoanAccount;
	}

	public void setHomeLoanAccount(HomeLoanAccount homeLoanAccount) {
		this.homeLoanAccount = homeLoanAccount;
	}

	private HomeLoanAccount homeLoanAccount;
	
	private Map<Integer,String> custData;
	public Properties getAditionalInfo() {
		return aditionalInfo;
	}

	public void setAditionalInfo(Properties aditionalInfo) {
		this.aditionalInfo = aditionalInfo;
	}

	private Properties aditionalInfo;
	
	public Map<Integer, String> getCustData() {
		return custData;
	}

	public void setCustData(Map<Integer, String> custData) {
		this.custData = custData;
	}

	public Set<String> getAccSet() {
		return accSet;
	}

	public void setAccSet(Set<String> accSet) {
		this.accSet = accSet;
	}

	List<String> loanList;
	Set<String> accSet;

	public List<String> getLoanList() {
		return loanList;
	}

	public void setLoanList(List<String> loanList) {
		this.loanList = loanList;
	}

	@Override
	public String toString() {
		return "CustomerBean [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNo=" + mobileNo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
