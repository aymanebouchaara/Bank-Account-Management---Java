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



    public void setBalance(double balance) {
        this.balance = balance; 
    }

    public double getBalance() {
        return this.balance; 
    }

}
