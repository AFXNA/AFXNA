//Naranjavkhlan Tumenbold COP2805C Dr.Cash
//Chapter 12.6
//This program implements exception handling

import java.util.*;

public class NumberFormat {
    public static void main(String[] args) {
        //variables
        String userDec;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a hexadecimal");
        userDec = scnr.nextLine();

        try
        {
            int userDecimal = hex2dec(userDec);
            System.out.println("The decimal value for " + userDec + " is " + userDecimal);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Not a hexadecimal");
        }
        finally
        {
            System.out.println("Program executed successfully");
        }

    }
    public static int hex2dec(String user) throws NumberFormatException
    {
        //If the receiving input is not a hexadecimal, it throws exception
        return Integer.parseInt(user, 16);
    }

}
