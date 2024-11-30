//Naranjavkhlan Tumenbold
//COP2805C Dr.Cash
//11.6 this program implements arraylist to store objects and invokes their
// toString() methods

import java.util.ArrayList;
import java.util.Date;

public class objArrayList {
    public static void main(String[] args) {
        Loan loan = new Loan();
        Date date = new Date();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10);

        ArrayList<Object> myList = new ArrayList<>();

        myList.add(loan);
        myList.add(date);
        myList.add(circle1);
        myList.add(circle2);

        for(int i = 1; i<=myList.size(); i++)
        {
            System.out.println("Object # " + i + " " + myList.get(i-1));
        }

    }
}

class Loan{
    //Default constructor
    Loan()
    {

    }
    //Overriding toString() method
    @Override
    public String toString()
    {
        return "Loan Object";
    }


}
class Circle {
    private double circleRadius;
    //Default constructor and the constructor that recieves parameter
    Circle() {
        this.circleRadius = 0;
    }

    Circle(double radius)
    {
        circleRadius = radius;
    }

    @Override
    public String toString(){
        return "This is a circle with " + circleRadius +" radius";
    }
}
