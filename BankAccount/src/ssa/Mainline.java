package ssa;

public class Mainline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Account checking = new Account();
			checking.setAccountId(100);
			checking.setAccountDescription("My personal checking account");
			checking.setInitialBalance(500);
			checking.getAccountStatus();
			checking.deposit(700);
			checking.getAccountStatus();
			checking.withdraw(600);
			checking.getAccountStatus();
			checking.deposit(100);
			checking.getAccountStatus();
			checking.withdraw(300);
			checking.getAccountStatus();
			checking.withdraw(200);
			checking.getAccountStatus();
			
			Account savings = new Account();
			savings.setAccountId(200);
			savings.setAccountDescription("My personal savings account");
			savings.setInitialBalance(2000);
			savings.getAccountStatus();
			savings.withdraw(750);
			savings.getAccountStatus();
			savings.withdraw(250);
			savings.getAccountStatus();
			savings.deposit(200);
			savings.getAccountStatus();
			
			savings.getAccountStatus();
			checking.getAccountStatus();
			
			
	}

}
