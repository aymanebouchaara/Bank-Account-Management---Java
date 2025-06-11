package com.bankaccountmanagement;

public class SavingsAccount extends BankAccount {

    private double interestRate = 0.05;

    public SavingsAccount(double balance) {
        super(balance); 
    }

    public void addInterest() {
       double interest = getBalance() * interestRate;
       deposit(interest);
       System.out.println("Interest added: " + interest);
    }
}

