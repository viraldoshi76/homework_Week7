package homework_Week7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Commission {

    public void salesCommission(){
        int amount = 0;
        Scanner input = new Scanner(System.in);


//
//
//

        System.out.print("Sales id : " );
        int id = input.nextInt();
        System.out.print("Sellers Name : ");
        String name = input.next();
        System.out.print("Sales amount : ");
        amount = input.nextInt();
        if (amount<0){
            System.out.println("please enter valid number: ");
            amount = input.nextInt();
        }
        System.out.print("Basic Salary : ");
        int salary = input.nextInt();
        if (amount>=50000){
            System.out.println("Sales Commision : "+ amount*35/100);
        }else if(amount>=30000){
            System.out.println("Sales Commision : "+ amount*20/100);
        }else if (amount>=20000){
            System.out.println("Sales Commision : "+ amount*10/100);
        }else if (amount>=10000){
            System.out.println("Sales Commision : "+ amount*5/100);
        }else {
            System.out.println("Sales Commision : "+ amount*2/100);
        }


    }


}
