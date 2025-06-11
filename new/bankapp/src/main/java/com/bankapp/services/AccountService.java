package com.bankapp.services;
import com.bankapp.model.SavingsAccount;

public class AccountService {

    private final SavingsAccount account;

    public AccountService(SavingsAccount account) {
        this.account = account;
    }

    public void runDemo() {
        account.deposit(500);
        account.withdraw(200);
        
        account.addInterest();
        account.showBalance();
    }
}
