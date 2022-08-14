package com.weshopify.feature.customer.custructor.di;

import java.io.Serializable;

public class HomeLoanAccount implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String loanNumber;
		private long loanAmt;
		public HomeLoanAccount(String loanNumber, long loanAmt) {
			super();
			this.loanNumber = loanNumber;
			this.loanAmt = loanAmt;
		}
		@Override
		public String toString() {
			return "HomeLoanAccount [loanNumber=" + loanNumber + ", loanAmt=" + loanAmt + "]";
		}
		
		
		
}
