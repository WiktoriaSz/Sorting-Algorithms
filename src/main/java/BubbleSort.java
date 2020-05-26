/**
 * Checks each two neighbour elements in line and changes their place, if needed.
 * If change is done, variable pass is incremented. The sorting is repeated until pass == 0.
 * Bubble Sort is only viable for small collections.
 */
public class BubbleSort implements Sort {

    public int[] sortArray(int[] arr) {
        if (arr.length <= 0) {
            return arr;
        }

        int pass;
        do {
            pass = sort(arr);
        } while (pass != 0);

        return arr;
    }

    private int sort(int[] arr) {
        int pass = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pass++;
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        return pass;
    }

    /**
     * Alternative method. Recursive. In first pass the largest element is bubbled to the end because of each neighbour pass.
     * In recursion the method checks the array range shorter each time about 1.
     * In this case recursive method may be more costly.
     */
    public int[] recursiveBubbleSort(int[] arr, int n) {
        if (n == 1) {
            return arr;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        return recursiveBubbleSort(arr, n - 1);
    }

}
