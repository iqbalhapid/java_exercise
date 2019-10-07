import java.io.*;

public class OutofBalanceException extends Exception
{
    private double amount;
    
    public OutofBalanceException(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }



}