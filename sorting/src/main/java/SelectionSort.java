class SelectionSort {

    void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestNumberInArrayIndex = getSmallestNumberInArrayIndex(array, i);
            swapArrayElements(array, i, smallestNumberInArrayIndex);
        }
    }

    private int getSmallestNumberInArrayIndex(int[] array, int indexOfSortedElements) {
        int smallestNumberInArrayIndex = indexOfSortedElements;
        for (int j = indexOfSortedElements; j < array.length; j++) {
            if (array[j] < array[smallestNumberInArrayIndex]) {
                smallestNumberInArrayIndex = j;
            }
        }
        return smallestNumberInArrayIndex;
    }

    private void swapArrayElements(int[] array, int fromIndex, int toIndex) {
        int swapTemp = array[fromIndex];
        array[fromIndex] = array[toIndex];
        array[toIndex] = swapTemp;
    }
}
