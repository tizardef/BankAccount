package ssa;

public class Account {
	//properties
	
		int accountId;
		String accountDescription; 
		double accountBalance;
		double checking; 
		double savings;

		//deposit method
		void deposit(double depositAmount) {
			 accountBalance = accountBalance + depositAmount;
		}
		//withdraw method
		void withdraw(double withrdrawAmount) {
			 if ((accountBalance - withrdrawAmount) >= 0) {
				accountBalance = accountBalance - withrdrawAmount; 
			 }
			 else {
				 System.out.println("Insufficient funds! ");
			 }
						
		}
		
		void getAccountStatus() {
			System.out.println("The account ID is: " +  accountId);
			System.out.println("Account Description: " + accountDescription);
			System.out.println("The account balance is: " + accountBalance);
			System.out.println("******************************************************");
		}
		void setInitialBalance(double currentAccountBalance) {
			accountBalance = currentAccountBalance;
		}
		void setAccountId(int currentAccountId) {
			accountId = currentAccountId;
			
		}
		void setAccountDescription(String currentAccountDescription) {
			accountDescription = currentAccountDescription;
		}
}
