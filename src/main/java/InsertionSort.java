/**
 * The method compares each progressive index to previous ones and insert there where the element is smaller than the next.
 */
public class InsertionSort implements Sort {

    public int[] sortArray(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] recursiveInsertionSort(int[] arr, int length, int i) {
        if (length <= 1) {
            return arr;
        }
        for (int j = i; j > 0; j--) {
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        length--;
        i++;
        return recursiveInsertionSort(arr, length, i);
    }
}

