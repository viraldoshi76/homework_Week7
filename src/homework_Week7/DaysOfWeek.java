package homework_Week7;

import java.util.Scanner;

public class DaysOfWeek {

    public void daysOfWeek(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int days = input.nextInt();
        switch (days){

            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }

    }


}
