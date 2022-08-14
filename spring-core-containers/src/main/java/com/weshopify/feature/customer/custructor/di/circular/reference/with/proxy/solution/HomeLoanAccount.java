package com.weshopify.feature.customer.custructor.di.circular.reference.with.proxy.solution;

import java.io.Serializable;

public class HomeLoanAccount implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private String loanNumber;
	private long loanAmt;

	private CustomerBean customerBean;

//		By creating both the class has a constructor injection it ill create the circular reference problem , so to resolve that issue make HomeLoanAccount has a setter injection by using the Proxy Bean creation.
//		public HomeLoanAccount(String loanNumber, long loanAmt,CustomerBean customerBean) {
//			super();
//			this.loanNumber = loanNumber;
//			this.loanAmt = loanAmt;
//		}

//		To reolve this problem,

	
	@Override
	public String toString() {
		return "HomeLoanAccount [loanNumber=" + loanNumber + ", loanAmt=" + loanAmt + ", customerBean=" + customerBean
				+ "]";
	}

	public String getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}

	public long getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(long loanAmt) {
		this.loanAmt = loanAmt;
	}

	public CustomerBean getCustomerBean() {
		return customerBean;
	}

	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}

}
