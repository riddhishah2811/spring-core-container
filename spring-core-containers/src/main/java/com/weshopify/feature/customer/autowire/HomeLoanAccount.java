package com.weshopify.feature.customer.autowire;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class HomeLoanAccount implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String loanNumber;
		private long loanAmt=90000;
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
}
