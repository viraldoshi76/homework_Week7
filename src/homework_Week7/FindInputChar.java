package homework_Week7;

import java.util.Scanner;

public class FindInputChar {

    public void findinputchar() {
        Scanner input = new Scanner(System.in);
        char find = input.next().charAt(0);
        if (find >= 48 && find <= 57) {
            System.out.println("input is digit:");
        }else if ((find>='a' && find<='z' )||(find>='A' && find<='Z')){
            System.out.println("input is Alphabet");
        }else{
            System.out.println("input is special character");
        }
    }


}
