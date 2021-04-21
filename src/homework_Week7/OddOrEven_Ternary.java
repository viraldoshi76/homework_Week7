package homework_Week7;

/*
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class OddOrEven_Ternary {

    //instance method
    public void odd(){
        Scanner input = new Scanner(System.in);//scanner object used to input data
        System.out.print("Please enter the number:");
        int num = input.nextInt();//read the input
        String evenodd = (num % 2==0) ? "even number":"odd number";//ternary operator ?: used
        System.out.println(num + " is " + evenodd);



    }



}
