
import org.junit.Before;
import org.junit.Test;
import util.MyUtil;

import static org.junit.Assert.*;

public class TestSort {

    private int[] unsorted;
    private int[] sorted;


    @Before
    public void setUp() {
        unsorted = Data.arr;
        sorted = Data.sorted.clone();

    }


    @Test
    public void testSelectSort() {
        Sort s = new SelectionSort();
        int[] tested = methodToTest(s.sortArray(unsorted.clone()));
        assertArrayEquals(sorted, tested);
    }

    @Test
    public void testBubbleSort() {
        Sort s = new BubbleSort();
        int[] tested = methodToTest(s.sortArray(unsorted.clone()));
        assertArrayEquals(sorted, tested);
    }

    @Test
    public void testRecursiveBubbleSort() {
        BubbleSort b = new BubbleSort();

        final double startTime = System.nanoTime();
        int[] tested = methodToTest(b.recursiveBubbleSort(unsorted.clone(), unsorted.length));
        final double endTime = System.nanoTime();
        System.out.println("Total execution time: " + (endTime - startTime) / 1000000);

        assertArrayEquals(sorted, tested);
    }

    @Test
    public void testInsertionSort() {
        Sort s = new InsertionSort();
        int[] tested = methodToTest(s.sortArray(unsorted.clone()));
        assertArrayEquals(sorted, tested);
    }

    @Test
    public void testRecursiveInsertionSort() {
        InsertionSort i = new InsertionSort();

        final double startTime = System.nanoTime();
        int[] tested = methodToTest(i.recursiveInsertionSort(unsorted.clone(), unsorted.length, 1));
        final double endTime = System.nanoTime();
        System.out.println("Total execution time: " + (endTime - startTime) / 1000000);

        assertArrayEquals(sorted, tested);
    }



  //*************************************************************
    private int[] methodToTest(int[] arr) {
        MyUtil.printIntArray("given    ", unsorted);
        MyUtil.printIntArray("expected ", sorted);
        MyUtil.printIntArray("result   ", arr);
        return arr;
    }
}
