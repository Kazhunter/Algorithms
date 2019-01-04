import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class MergeSortTest {

    @Test
    public void sortPositiveIntegerList() {
        int[] array = {10, 1500, 89, 78, 1, 2, 7};
        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.sort(array);
        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void sortIntegerList() {
        int[] array = {10, 1500, -5, -3, 89, 78, 0, 1, 2, 7};
        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.sort(array);
        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void sortNegativeIntegerList() {
        int[] array = {-5, -15, -3, -2, -1000};
        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.sort(array);
        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void sortIntegerWithDuplicationList() {
        int[] array = {10, 1500, 0, 1, 1, 1, 1, 1, 1, -5, -3, 89, 78, 0, 1, 2, 7};
        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.sort(array);
        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void sortEmptyList() {
        int[] array = {};
        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.sort(array);
        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void sortOneElementList() {
        int[] array = {0};
        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.sort(array);
        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void sortRandomGeneratedNumbersList() {
        int[] array = new Random().ints(10, -100, 100).toArray();
        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.sort(array);
        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void sortRandomBigGeneratedNumbersList() {
        int[] array = new Random().ints(1000000, -1000000, 1000000).toArray();
        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.sort(array);
        Assert.assertTrue(isArraySorted(sortedArray));
    }

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
