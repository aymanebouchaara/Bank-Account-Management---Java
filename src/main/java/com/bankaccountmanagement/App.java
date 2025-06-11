package com.bankaccountmanagement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SavingsAccount myAccount = new SavingsAccount(1000);
        myAccount.deposit(500);
        myAccount.withdraw(50);
        myAccount.addInterest();
        myAccount.showBalance();
    }
}