//Naranjavkhlan Tumenbold 11.3


import java.util.Date;

public class Account {

    //Date fields

    private int ID;
    private double balance;

    private double annualInterestRate;
    private java.util.Date date = new Date();

    //Default constructor
    Account() {
        this.ID = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.date = new Date();

    }

    //Constructor that accepts parameters
    Account(int ID, double balance, double annualInterestRate) {
        this.ID = ID;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    //Mutator methods

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    //Accessor methods
    public int getID()
    {
        return ID;
    }
    public double getBalance()
    {
        return balance;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public Date getDate()
    {
        return date;
    }

    //3 methods

    public double getMonthlyInterestRate()
    {
        return (balance * annualInterestRate*100)/12;
    }

    public void withdraw(double userWithdrawn)
    {
        balance -= userWithdrawn;
    }
    public void deposit(double userDeposit)
    {
        balance += userDeposit;
    }
}
