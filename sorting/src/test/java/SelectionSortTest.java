import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SelectionSortTest {

    @Test
    public void sortPositiveIntegerList() {
        int[] array = {10, 1500, 89, 78, 1, 2, 7};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        Assert.assertTrue(isArraySorted(array));
    }

    @Test
    public void sortIntegerList() {
        int[] array = {10, 1500, -5, -3, 89, 78, 0, 1, 2, 7};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        Assert.assertTrue(isArraySorted(array));
    }

    @Test
    public void sortNegativeIntegerList() {
        int[] array = {-5, -15, -3, -2, -1000};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        Assert.assertTrue(isArraySorted(array));
    }

    @Test
    public void sortIntegerWithDuplicationList() {
        int[] array = {10, 1500, 0, 1, 1, 1, 1, 1, 1, -5, -3, 89, 78, 0, 1, 2, 7};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        Assert.assertTrue(isArraySorted(array));
    }

    @Test
    public void sortEmptyList() {
        int[] array = {};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        Assert.assertTrue(isArraySorted(array));
    }

    @Test
    public void sortOneElementList() {
        int[] array = {0};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        Assert.assertTrue(isArraySorted(array));
    }

    @Test
    public void sortRandomGeneratedNumbersList() {
        int[] array = new Random().ints(10, -100, 100).toArray();
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        Assert.assertTrue(isArraySorted(array));
    }

    //    @Test  // Run this if you have some time to spend
    //    public void sortRandomBigGeneratedNumbersList() {
    //        int[] array = new Random().ints(1000000,-1000000,1000000).toArray();
    //        System.out.println("Random");
    //        SelectionSort bubbleSort = new SelectionSort();
    //        bubbleSort.sort(array);
    //        Assert.assertTrue(isArraySorted(array));
    //    }

    private boolean isArraySorted(int[] array) {
        if (isArrayEmpty(array) || isArrayHasOneElement(array)) {
            return true;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isArrayHasOneElement(int[] array) {
        return array.length == 1;
    }

    private boolean isArrayEmpty(int[] array) {
        return array.length == 0;
    }
}
