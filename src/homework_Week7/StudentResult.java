package homework_Week7;

import java.util.Scanner;

public class StudentResult {

    public void result(){
        System.out.println("-------------------------------");
        System.out.println("|                              |");
        System.out.println("|         Mark Sheet           |");
        System.out.println("|                              |");
        System.out.print("--------------------------------");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("|     Name    :      " +name +"     |");
        int rollno = input.nextInt();
        System.out.println("|    Roll no.  :      " +rollno +"        |");
        System.out.print("--------------------------------");
        int maths = input.nextInt();
        if (maths>0 && maths<100){
        System.out.print("|    Maths     :     "+ maths +"        |");}
        int science = input.nextInt();
        if (science>0 && science<100){
        System.out.print("|    Science  :      "+ science +"         |");}
        int english = input.nextInt();
        if (english>0 && english<100){
        System.out.println("|    English   :     "+ english +"        |");}
        System.out.println("|                              |");
        System.out.println("--------------------------------");
        int total = maths+english+science;
        System.out.println("|   Total      :     "+total   + "       |");
        float percentage = (total*100) /300;
        System.out.println("|   Percentage :    "+ percentage+"       |");
        if (percentage>=35 && percentage<50){
        System.out.println("|    Result    :       pass    |");
        System.out.println("|    Grade     :        C      |");}
        else if(percentage>=50 && percentage<60){
        System.out.println("|    Result    :       pass    |");
        System.out.println("|    Grade     :        B      |");}
        else if(percentage>=60 && percentage<80){
        System.out.println("|    Result    :       pass    |");
        System.out.println("|    Grade     :        A      |");}
        else if(percentage>=80){
        System.out.println("|    Result    :       pass    |");
        System.out.println("|    Grade     :        A+     |");}
        else {
        System.out.println("|    Grade     :       Fail    |");


        }

        System.out.println("--------------------------------");







    }



}
