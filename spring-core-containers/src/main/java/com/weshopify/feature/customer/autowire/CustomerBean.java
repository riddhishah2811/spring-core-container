package com.weshopify.feature.customer.autowire;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* @Autowired will be work on as a field, setter method(constructor is commented) and constructor level(setter is commented)*/
/*@Atowired is by default not enabled, so ew have to use the <context:annotation-config> and add the xmlns for context of a perticular version. */
@Component
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

//	Without @Autowired to class attributes needs to define the -> ref element or the attribute autowire required in .xml file.
//	private HomeLoanAccount homeLoanAccount;
	
//	With @Autowired annotation at field level
//	@Autowired
	private HomeLoanAccount homeLoanAccount;
	
//	This constructor is for autowwire="constructor" in <bean></bean>
//	With @Autowired annotation at constructor level
	@Autowired
	public CustomerBean(HomeLoanAccount homeLoanAccount) {
		super();
		this.homeLoanAccount = homeLoanAccount;
	}

	public HomeLoanAccount getHomeLoanAccount() {
		return homeLoanAccount;
	}

//	With @Autowired annotation at method level
//	@Autowired	
//	public void setHomeLoanAccount(HomeLoanAccount homeLoanAccount) {
//		this.homeLoanAccount = homeLoanAccount;
//	}

	private Map<Integer, String> custData;

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
