package ssa;

public class Savings extends Account {
	
	private double interestRate = .015;
	
	
	public Savings(){}

	public Savings(double amount, double interest) {
		super(amount); 
		interestRate = interest;
		
	}
	
	public double calcDepositInterest(int months) {
		double calculatedInterestRate = (this.interestRate/ 12) * months * getAccountBalance();
		//
		super.deposit(calculatedInterestRate);
		return calculatedInterestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
