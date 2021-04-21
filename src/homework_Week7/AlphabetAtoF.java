package homework_Week7;

import java.util.Scanner;

public class AlphabetAtoF {

    public void atof() {
       char alpha;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the letter: ");
        alpha = input.next().charAt(0);
        if(alpha=='A'|| alpha=='a'){
            System.out.println("Ahmedabad");}
        else if(alpha=='B'|| alpha=='b'){
            System.out.println("Baroda");
        }else if(alpha=='C'|| alpha=='c'){
            System.out.println("Charotar");
        }else if(alpha=='D' || alpha=='d'){
            System.out.println("Dholka");
        }else if(alpha=='E' || alpha=='e'){
            System.out.println("Ellora");
        }else if(alpha=='F' || alpha=='f'){
            System.out.println("Faridabad");
        }else{
            System.out.println("please enter the valid alphabet");
        }


    }


}