package util;

public class MyUtil {

    public static void printIntArray(String text, int[] arr){
        System.out.print(text + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }


}
