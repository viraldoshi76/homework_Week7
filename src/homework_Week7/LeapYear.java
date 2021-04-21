package homework_Week7;

import java.util.Scanner;

/*
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 *not?
 * */

//instance method
public class LeapYear {

    public void leapyear(){
        Scanner input = new Scanner(System.in);//scanner object for input data
        System.out.println("Enter the year in four digit: ");
        int leap = input.nextInt();//read input data
        String year = (leap % 4 ==0) ? "Leap Year" : "not Leap year";//ternary operator used to find leap year
        System.out.println( leap + " is " + year );//print statement

    }
}
