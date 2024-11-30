//Naranjavkhlan Tumenbold COP2805C Dr.Cash
//Chapter 12.3
//This program implements random integers, array out of bounds exception, and input mismatch exception

import java.util.*;

public class ArrayBounds{
    public static void main(String[] args) {
        //Variables
        int[] myRandomArray = new int[100];
        Random rand = new Random();
        boolean output = true;

        Scanner scnr = new Scanner(System.in);

        int userNum;
        //Looping through the array to assign random value
        for (int i = 0; i < myRandomArray.length; i++)
        {
            myRandomArray[i] = rand.nextInt(1000);
        }
        //Since we won't ensure that the user enters right input for our desired value
        //We will loop until the user enters right input
        do{
            try
            {
                System.out.println("Choose a number between 1-100");
                userNum = scnr.nextInt();
                System.out.println("The " + userNum +"th element of the array is " +
                        myRandomArray[userNum-1]);

                //Flag variable, if the user enters right, compatible value, we terminate the loop
                output = false;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("The number you have entered is out of bounds");
            }
            catch(InputMismatchException e) {
                System.out.println("The number you have entered is not compatible for int value");
                scnr.next();
            }
        }while(output);

    }
}

