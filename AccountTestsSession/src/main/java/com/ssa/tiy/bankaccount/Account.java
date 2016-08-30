package com.ssa.tiy.bankaccount;

public class Account {
	//properties
	
		private int accountId;
		String description; 
		private double accountBalance;
		
		//constructor to set the initial account balance to 0
		public Account() {
			   this.accountBalance = 0;
		
		}
		public Account(double accountBalance) {
			this.accountBalance = accountBalance;
		}
		
		
		public Account(String description) {
			   this.description = description;
			   this.accountBalance = 0;
		}
		public Account(int accountId, String description) {
			   this.accountId = accountId;
			   this.description = description;
			   this.accountBalance = 0;
			
		}
		//deposit method
		public double deposit(double depositAmount) {
			 accountBalance = accountBalance + depositAmount;
			 return accountBalance;
		}
		//withdraw method
		public double withdraw(double withdrawAmount) {
			 if ((accountBalance - withdrawAmount) >= 0) {
				accountBalance = accountBalance - withdrawAmount; 
				return accountBalance;
			 }
			 else {
				 System.out.println("Insufficient funds! ");
				 return -1;
			 }
						
		}
		
		void getAccountStatus() {
			System.out.println("The account ID is: " +  accountId);
			System.out.println("Account Description: " + description);
			System.out.println("The account balance is: " + accountBalance);
			System.out.println("******************************************************");
		}
		//private void setInitialBalance(double accountBalance) {
			//this.accountBalance = accountBalance;
		
	
		
		
		private void setAccountId(int currentAccountId) {
			accountId = currentAccountId;
			
		}
		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}
		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}
		/**
		 * @return the accountBalance
		 */
		public double getBalance() {
			return accountBalance;
		}
		/**
		 * @param accountBalance the accountBalance to set
		 */
		void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}
		public int getAccountId() {
			return accountId;
		}
		
		void setAccountDescription(String description) {
			this.description = description;
		}
		
		public double transferFrom(Account account, double amount) {
			
			if (account.getBalance()> amount){
				account.withdraw(amount);
				this.deposit(amount);
				return amount;
			}else
//
				System.out.println("Insufficient funds ");
			return -1;
		}
}
