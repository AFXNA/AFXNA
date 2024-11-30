//Naranjavkhlan Tumenbold COP2805C Dr.Cash
//Chapter 12.2
//This program implements InputMismatchException

import java.util.*;

public class InputMismatch {
    public static void main(String[] args) {
        //Variables
        int num1, num2;
        boolean output = true;


        Scanner scnr = new Scanner(System.in);
        // There is no way that we ensure the user enters an integer for their first try
        // So the best way to handle that is do a post-test loop and loops until the user enters
        // the right input
        do
        {
            try
            {
                System.out.println("Please enter an INTEGER");
                num1 = scnr.nextInt();
                System.out.println("Please enter the second INTEGER");
                num2 = scnr.nextInt();
                //If the user entered the correct input, we terminate the loop
                output = false;

                System.out.println("The addition of two numbers that you have entered is " + (num1 + num2));
            }
            catch(InputMismatchException e)
            {
                System.out.println("Sorry, we only accept INTEGERS");
                //Clearing the input
                scnr.nextLine();
            }
        }while(output);

    }
}