package homework_Week7;

public class DaysInMonth {

    public static boolean isLeapYear(int year) {

        boolean year1;
        if (year >= 1 && year <= 9999 && (year % 4 == 0)) {
            year1 = true;
        } else {
            year1 = false;
        }
        return year1;
    }



    public static int getDaysInMonth(int month, int year) {


        int days = 0;
        if (month <1 || month > 12 && year <1 || year >9999) {

            System.out.println("please enter the valid month");
            days = -1;
        }else{


            switch (month) {
                case 1:

                    System.out.println("31");

        break;
        case 2:
        if (isLeapYear(year)==true) {
            System.out.println("29");
        } else {
            System.out.println("28");
        }
        break;
        case 3:
        System.out.println("31");
        break;
        case 4:
        System.out.println("30");
        break;
        case 5:
        System.out.println("31");
        break;
        case 6:
        System.out.println("30");
        break;
        case 7:
        System.out.println("31");
        break;
        case 8:
        System.out.println("31");
        break;
        case 9:
        System.out.println("30");
        break;
        case 10:
        System.out.println("31");
        break;
        case 11:
        System.out.println("30");
        break;
        case 12:
        System.out.println("31");
        break;

    }

    }


        return days;
    }
    



    }



