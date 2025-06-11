package com.bankapp;
import com.bankapp.model.SavingsAccount;
import com.bankapp.services.AccountService;

public class Main {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(1000);
        AccountService service = new AccountService(myAccount);
        service.runDemo();
    }
}
