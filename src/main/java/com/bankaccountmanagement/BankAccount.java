package com.bankaccountmanagement;

public class BankAccount {

    private double balance; 

    public BankAccount(double balance) {
        this.balance = balance;
    }

    //Methods 
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit: " + amount);
    }

    public void withdraw(double amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Balance not sufficient");
        }
    } 

    public void showBalance () {
    	System.out.println("Balance: " + this.balance);
    }


    public void setBalance(double balance) {
        this.balance = balance; 
    }

    public double getBalance() {
        return this.balance; 
    }

}
