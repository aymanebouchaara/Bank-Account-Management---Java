package com.bankaccountmanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0);
    }

    @Test
    @DisplayName("Deposit increases balance correctly")
    void depositPositiveAmount_shouldIncreaseBalance() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    @DisplayName("Withdraw decreases balance correctly")
    void withdrawPositiveAmount_shouldDecreaseBalance()  {
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test 
    @DisplayName("Withdraw will not work if amount is too high")
    void withdrawPositiveAmount_shouldNotWork() {
        account.withdraw(101);
        assertEquals(100, account.getBalance(), 0.001);
    }

    @Test
    @DisplayName("Check that get balance is working")
    void correctBalanceShowing() {
        assertEquals(100,account.getBalance(),0.001,"getBalance has failed");    
    }

    @Test
    @DisplayName("Check that the correct balance is set")
    void correctBalanceSet(){
        double oldBalance = account.getBalance();
        account.setBalance(200);
        double newBalance = account.getBalance();
        assertEquals(200,newBalance,0.001,"Balance is not set correctly");
        assertNotEquals(oldBalance,newBalance);
    }
}
