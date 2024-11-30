//Naranjavkhlan Tumenbold
//11.4 ArrayList COP2805C Dr.Cash
//This program implements ArrayList and passes it to method


import java.util.Scanner;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //Declaring Variables

        ArrayList myList = new ArrayList<>();
        Integer userPrompt;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a number ending in 0");
        userPrompt = scnr.nextInt();
        //Checking if the number is divisible by 10
        if(userPrompt % 10 != 0)
        {
            System.out.println("We only accept numbers divisible by 10");
            userPrompt = scnr.nextInt();
        }
        else
            myList.add(userPrompt);
        //Not fully dummyproof but loop terminates if the user enters 0

        while(userPrompt != 0)
        {
            System.out.println("Enter 0 if you finished adding numbers to list");
            userPrompt = scnr.nextInt();

            if(userPrompt % 10 != 0)
            {
                System.out.println("We only accept numbers divisible by 10");
                userPrompt = scnr.nextInt();
            }
            else if (userPrompt == 0)
            {
                break;
            }
            else
                myList.add(userPrompt);
        }
        //Passes the myList to the method max and printing out the max value
        System.out.println("The maximum of the list is " + max(myList));


    }

    public static Integer max(ArrayList<Integer> myList) {
        Integer max = myList.get(0);
        //If myList is empty return null
        if (myList.size() == 0)
        {
            return null;
        }
        else {
            //Iterating through myList to get the maximum value
            for (int i = 0; i < myList.size(); i++)
            {
                //If declared maximum is lower than the value in list
                //assign new value to max
                if(max<myList.get(i)) {
                    max = myList.get(i);
                }
            }
        }

        return max;
    }

}