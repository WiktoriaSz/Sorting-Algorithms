import java.util.Arrays;

/**
 * Finds the smallest and positions it as a first element of array. Next it searches the array from next index as first.
 */
public class SelectionSort implements Sort{

    public int[] sortArray(int[] arr) {
        int index = 0;

        while (index < arr.length - 1) {
            changeSmallest(arr, index);
            index++;
        }
        return arr;
    }

    public void changeSmallest(int[] arr, int start) {
        int smallest = start;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] < arr[smallest]) {
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
