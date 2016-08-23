package ssa;

public class Account {
	//properties
	
		private int accountId;
		String description; 
		private double accountBalance;
		
		//constructor to set the initial account balance to 0
		public Account() {
			   this.accountBalance = 0;
		
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
		void deposit(double depositAmount) {
			 accountBalance = accountBalance + depositAmount;
		}
		//withdraw method
		void withdraw(double withdrawAmount) {
			 if ((accountBalance - withdrawAmount) >= 0) {
				accountBalance = accountBalance - withdrawAmount; 
			 }
			 else {
				 System.out.println("Insufficient funds! ");
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
		public int getAccountId() {
			return accountId;
		}
		
		void setAccountDescription(String description) {
			this.description = description;
		}
		
		public void transferFrom(Account account, double amount) {
			
			
		}
}
