import java.io.*;

public class CheckingAccount {
    private double balance;
    private int number;

    public CheckingAccount(int number){
        this.number = number;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw (double amount) throws OutofBalanceException{
        if (amount <= balance){
            balance -= amount;
        }else{
            double needs = amount - balance;
            throw new OutofBalanceException(needs);
        }
    }

    public double getBalance(){
        return balance;
    }
}