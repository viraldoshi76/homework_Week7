package homework_Week7;

public class ContainsArray {

    public static boolean containArray(int arr[], int item) {

        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int[] array = {256,458,85,78,96,4587,3652,4587,45,321,98,785,321,};
        System.out.println(containArray(array,256));
        System.out.println(containArray(array,63));

    }

}
