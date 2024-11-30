//Naranjavkhlan Tumenbold
//October 4 2024
//COP2805C Dr.Cash
//This program implements classes and inheritance 11.3

public class Main {
        public static void main(String[] args) {
                // Create an Account object
                 Account account = new Account(1122, 20000, 4.5);

                // Create a SavingsAccount object
                savingsAccount savings = new savingsAccount(1234, 15000, account.getAnnualInterestRate());

                // Create a CheckingAccount object
                checkingAccount checking = new checkingAccount(5678, 3000, account.getAnnualInterestRate());

                // Invoke toString() methods
                System.out.println(account.toString());
                System.out.println(savings.toString());
                System.out.println(checking.toString());

                // Testing method
                savings.withdraw(16000);

                // Testing method
                checking.withdraw(3400); //
                System.out.println(checking.toString());
        }
}
