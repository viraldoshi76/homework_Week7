package homework_Week7;

import java.util.Scanner;

public class PosNegZero {

    public void posNegZer(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        if(num<0){
            System.out.println("Number is Negative");
        }else if(num==0){
            System.out.println("Number is Zero");
        }else{
            System.out.println("Number is Positive");
        }
    }


}
