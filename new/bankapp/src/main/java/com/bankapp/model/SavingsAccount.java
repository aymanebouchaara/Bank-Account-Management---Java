package com.bankapp.model;



public class SavingsAccount extends BankAccount {
    private double interestRate = 0.05;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void addInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

