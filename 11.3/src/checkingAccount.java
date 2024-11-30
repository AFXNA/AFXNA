//Naranjavkhlan Tumenbold 11.3

public class checkingAccount extends Account{

        //Default constructor
        checkingAccount()
        {
            super(0,0,0);
        }
        //Constructor
        checkingAccount(int ID, double balance, double annualInterestRate)
        {
            super(ID, balance, annualInterestRate);
        }

        @Override
        public void withdraw(double amount)
        {
            super.withdraw(amount);
        }
        @Override
        public String toString()
        {
            String s = "Checkings account ID: " + getID() + " created on " + getDate() + " has left with " + getBalance();
            return s;
        }






}
