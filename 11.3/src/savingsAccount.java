//Naranjavkhlan Tumenbold 11.3


public class savingsAccount extends Account {

    //Constructor
    savingsAccount(int ID, double balance, double annualInterestRate) {
        super(ID, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance())
        {
            System.out.println("Not enough balance, try again");
        }
        else
            super.withdraw(amount);
    }

    @Override
    public String toString()
    {
        return "Savings ID: " + getID() + " created on " + getDate() + " with a balance left with " + getBalance();
    }

}
