package homework_Week7;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

    public void sortArray(){
        int[] array1= {25,36,85,96,74,5,8,9,75,36,10,15};
        String[] array2 = {"deepak","jalpa","niddhi","rajendra","viral","amitbhai","jitubhai","snehaben"};
        Arrays.sort(array1);
        System.out.println("Sorted numeric array "+ Arrays.toString(array1));
        Arrays.sort(array2);

    }


}
