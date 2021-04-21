package homework_Week7;

import java.util.Scanner;

public class Divisible3and5 {
    public void divisible(){
        int a;
        System.out.println("Divsible by 3");
        for(a=1; a<100; a++){
            if (a %3 ==0){
                System.out.print(a);
            }
        }
        System.out.println("");
        System.out.println("Divisble by 5");
        for (a=1;a<100;a++){
            if(a %5==0) {
                System.out.print(a);
            }
        }
    }


}
