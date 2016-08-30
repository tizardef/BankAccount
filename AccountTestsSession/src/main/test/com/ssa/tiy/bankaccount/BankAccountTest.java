package com.ssa.tiy.bankaccount;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	Account acct= new Account();
	Savings savingsAcct= new Savings();
	@Before
	public void setup(){
		acct.setDescription("Evans Account");
		acct.setAccountBalance(100);
		savingsAcct.setInterestRate(0.015);
		
		
	}

	@Test
	public void testBalance(){
		assertEquals(100,acct.getBalance(),0);
		
	}
	
	@Test 
	public void testWithdrawal(){
		assertEquals(0, acct.withdraw(100),0);
		
	}
	@Test
	public void testDeposit() {
		assertEquals(200, acct.deposit(100),0);
		
	}
	@Test
	public void testTransferFrom() {
		assertEquals(-1,new Account().transferFrom(acct, 500),0);
		
	}
	@Test
	public void testDescription() {
		assertEquals("Evans Account", acct.getDescription());
		
	}
	@Test
	public void testSavings(){
		assertEquals(0.015, savingsAcct.getInterestRate(),0);
		
	}
	

}
