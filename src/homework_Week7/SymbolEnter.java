package homework_Week7;

import java.util.Scanner;

public class SymbolEnter {

    public void symbolEnter(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        char sch;
        System.out.print("Enter the operator (+,-,/,*) :");
        sch = input.next().charAt(0);
        if (sch == '+'){
            System.out.println("Addition of "+ a +" + "+ b+ " = "+ (a+b));
        }else if(sch == '-'){
            System.out.println("Subtraction of "+a+" - "+b + "="+ (a-b));
        }else if(sch == '*'){
            System.out.println("Multipication of "+ a +" * "+b+" = "+(a*b));
        }else if(sch == '/'){
            System.out.println("Division of "+ a +" / "+b +" = "+(a/b));
        }


    }


}
