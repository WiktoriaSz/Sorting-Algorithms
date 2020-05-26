import java.util.Arrays;

public class MergeSort {

    /**
     * The method takes start and end indexes of the array which is to be sorted.
     * The method partitions the array until it is 1-element array.
     * Then it compares elements of those two arrays and merges it into one recursively.
     * It takes additional memory space equal to the length of the array which is to be sorted.
     */
    public void sortArray(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        int middle = (end + start) / 2;

        sortArray(arr, start, middle);
        sortArray(arr, middle + 1, end);

        merge(arr, start, middle, end);

    }

    private void merge(int[] arr, int start, int middle, int end) {

        int[] left = populate(arr, start, (middle - start + 1));
        int[] right = populate(arr, middle + 1, (end - middle));

        int indexL = 0;
        int indexR = 0;

        // copies from both arrays to sorted array - elements don't need to be swapped, because are stored in temporary sub-arrays
        for (int i = start; i <= end; i++) {

            if ((indexL <= middle - start) && (indexR < end - middle)) {
                if (left[indexL] < right[indexR]) {
                    arr[i] = left[indexL];
                    indexL++;
                } else {
                    arr[i] = right[indexR];
                    indexR++;
                }
            }
            // copies left elements from left array
            else if (indexL <= middle - start) {
                arr[i] = left[indexL];
                indexL++;
            }
            // copies left elements from right array
            else if (indexR < end - middle) {
                arr[i] = right[indexR];
                indexR++;
            }
        }

    }

    /**
     * The method sorts Strings alphabetically.
     * @param begin the first index of the array.
     * @param end   the last index of the array.
     */
    public void sortStringArray(String[] arr, int begin, int end) {
        if (end <= begin) {
            return;
        }

        int mid = (begin + end) / 2;
        sortStringArray(arr, begin, mid);
        sortStringArray(arr, mid + 1, end);

        mergeStringArrays(arr, begin, mid, end);
    }

    private void mergeStringArrays(String[] arr, int begin, int mid, int end) {

        String[] left = populateStringArr(arr, begin, (mid - begin + 1));
        String[] right = populateStringArr(arr, (mid + 1), (end - mid));
        int inL = 0;
        int inR = 0;

        for (int i = begin; i <= end; i++) {
            if (inL < left.length && inR < right.length) {
                if (left[inL].charAt(0) < right[inR].charAt(0)) {
                    arr[i] = left[inL];
                    inL++;
                } else if (left[inL].charAt(0) == right[inR].charAt(0)) {
                    arr[i] = checkString(left[inL], right[inR]);
                    if (arr[i].equals(left[inL])) {
                        inL++;
                    } else {
                        inR++;
                    }
                } else {
                    arr[i] = right[inR];
                    inR++;
                }
            } else if (inL < left.length) {
                arr[i] = left[inL];
                inL++;
            } else if (inR < right.length) {
                arr[i] = right[inR];
                inR++;
            }
        }

    }

    private String checkString(String s, String s1) {
        String temp = s.length() < s1.length() ? s : s1;
        for (int i = 0; i < temp.length(); i++) {
            if (s.charAt(i) != s1.charAt(i)) {
                return s.charAt(i) < s1.charAt(i) ? s : s1;
            }
        }
        return s;
    }

    private String[] populateStringArr(String[] origin, int start, int length) {
        String[] newArr = new String[length];
        for (int i = 0; i < length; i++) {
            newArr[i] = origin[start + i];
        }
        return newArr;
    }

    private int[] populate(int[] origin, int start, int length) {
        int[] newArr = new int[length];
        for (int i = 0; i < length; i++) {
            newArr[i] = origin[start + i];
        }
        return newArr;
    }
}
