package homework_Week7;

import java.util.Scanner;

public class GrossSalary {

    public void grossSal(){
        System.out.println("-------------------------------");
        System.out.println("|         Salary Slip          |");
        System.out.print("-------------------------------");

        Scanner input = new Scanner(System.in);

        int id = input.nextInt();
        System.out.print("| Employee Id    :    "+ id +"       |");
        String name = input.next();
        System.out.println("| Employee name  :    "+ name +"     |");
        System.out.print("-------------------------------");
        int basic = input.nextInt();
        System.out.println("| Basic Salary   :    "+ basic+"     |");
        System.out.println("| HRA 10%        :    "+basic/100*10+"      |");
        System.out.println("| TA 8%          :    "+basic/100*8 +"      |");
        System.out.println("| DA 9%          :    "+basic/100*9 +"      |");
        System.out.println("| PF 20%         :    "+basic/100*20+"      |");
        System.out.println("|                              |");
        System.out.println("-------------------------------");
        System.out.println("| Gross Salary   :    "+basic*1.47  +"   |");
        System.out.println("-------------------------------");




    }


}
