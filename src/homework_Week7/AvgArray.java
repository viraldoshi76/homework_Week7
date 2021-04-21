package homework_Week7;

public class AvgArray {

    public void avgArray(){
        int array[] = {25,65,85,9,40,20,50,10};
        int sum =0;
        int i;
        for (i=0; i<array.length;i++)
            sum = sum +array[i];
        double avg = sum /array.length;
        System.out.println("The Average is "+ avg);
    }


}
