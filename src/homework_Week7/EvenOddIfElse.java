package homework_Week7;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class EvenOddIfElse {

    public void evenOdd(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int eo = input.nextInt();
        if (eo % 2 == 0){
            System.out.println("Number "+ eo+ " is even integer");
        }else {
            System.out.println("Number "+ eo + " is odd integer ");
        }

    }


}
