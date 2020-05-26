import org.junit.Before;
import org.junit.Test;
import util.MyUtil;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class TestQuickAndMergeSort {
    private int[] unsorted;
    private int[] sorted;
    private String[] unsortedStr;
    private String[] sortedStr;
    private MergeSort m = new MergeSort();
    private QuickSort q = new QuickSort();


    @Before
    public void setUp() {
        unsorted = Data.arr;
        sorted = Data.sorted.clone();
        unsortedStr = Data.arrStr;
        sortedStr = Data.sortedStr.clone();
    }

    @Test
    public void testQuickSort() {
        int[] arr = unsorted.clone();
        q.sortArray(arr, 0, arr.length - 1);
        int[] tested = methodToTest(arr);
        assertArrayEquals(sorted, tested);
    }

    @Test
    public void testQuickSortForStringArray() {
        String[] arr = unsortedStr.clone();
        q.sortStringArray(arr, 0, arr.length - 1);
        String[] tested = methodToTestStrStr(arr);
        assertArrayEquals(sortedStr, tested);
    }

    @Test
    public void testMergeSort() {
        int[] arr = unsorted.clone();
        m.sortArray(arr, 0, arr.length - 1);
        int[] tested = methodToTest(arr);
        assertArrayEquals(sorted, tested);
    }

    @Test
    public void testMergeSortForStringArray() {
        String[] arr = unsortedStr.clone();
        m.sortStringArray(arr, 0, arr.length - 1);
        String[] tested = methodToTestStrStr(arr);
        assertArrayEquals(sortedStr, tested);
    }

    //*************************************************************
    private int[] methodToTest(int[] arr) {
        MyUtil.printIntArray("given    ", unsorted);
        MyUtil.printIntArray("expected ", sorted);
        MyUtil.printIntArray("result   ", arr);
        return arr;
    }

    private String[] methodToTestStrStr(String[] arr) {
        System.out.println("given    :" + Arrays.deepToString(unsortedStr));
        System.out.println("expected :" + Arrays.deepToString(sortedStr));
        System.out.println("result   :" + Arrays.deepToString(arr));
        return arr;
    }
}
