package com.weshopify.core.customized.springbeanlifecyclewithxml;

import java.io.Serializable;

public class HomeLoanAccount implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String loanNumber;
		private long loanAmt;
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
