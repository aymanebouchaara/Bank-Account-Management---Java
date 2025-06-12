package com.bankaccountmanagement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class SavingsAccountTest {
	private double interestRate;
	private SavingsAccount savingsAccount;
	
	@BeforeEach
	void setUp() {
		savingsAccount = new SavingsAccount(100.0);
	}
    
	@Test
	@DisplayName("Interest is added to account")
	void interestShouldBeAddedToAccount() {
		savingsAccount.addInterest();
		assertEquals(105.0, savingsAccount.getBalance(), 0.001);
	}
}
