package homework_Week7;

import java.util.Scanner;

public class AlphabetSwitchAF {

    public void atofSwitch() {
        char alpha;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        alpha = input.next().charAt(0);

        switch (alpha){

            case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'b' :
                System.out.println("Baroda");
                break;
            case 'c' :
                System.out.println("Charotar");
                break;
            case 'd' :
                System.out.println("Dholka");
                break;
            case 'e' :
                System.out.println("Ellora");
                break;
            case 'f' :
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("please enter the valid alphabet");

        }

    }


}
