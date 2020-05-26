public class QuickSort {


    /**
     * The algorithm partitions the array and recursively sorts each half-array.
     * Has complexity of O(logn).
     */
    public void sortArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(arr, start, end);

        sortArray(arr, start, pivot - 1);
        sortArray(arr, pivot + 1, end);
    }

    /**
     * Method sorts a sub-array from index start to index end. It compares sequential indexes to the last element (pivot).
     * If element is lesser than pivot it is swapped with the last counter element - with itself or in case of greater element, with it.
     * In consequence greater than pivot elements are moved to the right, but not in the correct order yet,
     * it will be accomplished in recurring partitions.
     */
    private int partition(int[] arr, int start, int end) {
        int pivot = end;

        int counter = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = temp;
                counter++;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[counter];
        arr[counter] = temp;

        return counter;
    }

    /**
     * @param arr
     * @param begin
     * @param end
     */
    public void sortStringArray(String[] arr, int begin, int end) {
        if (begin >= end) {
            return;
        }

        int pivot = partitionStrArr(arr, begin, end);
        sortStringArray(arr, begin, pivot - 1);
        sortStringArray(arr, pivot + 1, end);
    }

    private int partitionStrArr(String[] arr, int begin, int end) {
        int pivot = end;

        int counter = begin;
        String temp;
        for (int i = begin; i < end; i++) {
            if (arr[i].equals(compareAndReturnLesser(arr[i], arr[pivot]))) {
                temp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = temp;
                counter++;
            }
        }

        temp = arr[pivot];
        arr[pivot] = arr[counter];
        arr[counter] = temp;

        return counter;
    }

    private String compareAndReturnLesser(String el, String pivot) {
        int minLength = el.length() < pivot.length() ? el.length() : pivot.length();

        for (int i = 0; i < minLength; i++) {
            if (el.charAt(i) == pivot.charAt(i)) {
                continue;
            }
            if (el.charAt(i) < pivot.charAt(i)) {
                return el;
            } else {
                return pivot;
            }
        }
        return pivot;

    }


}
