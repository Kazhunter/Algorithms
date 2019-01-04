class MergeSort {
    int[] sort(int[] array) {
        if (array.length > 1) {
            return mergeSort(array, 0, array.length - 1);
        } else {
            return array;
        }
    }

    private int[] mergeSort(int[] array, int startPoint, int endPoint) {
        if (endPoint - startPoint <= 0) {
            return new int[]{array[endPoint]};
        }

        int midPoint = (endPoint + startPoint) / 2;
        int[] leftArray = mergeSort(array, startPoint, midPoint);
        int[] rightArray = mergeSort(array, midPoint + 1, endPoint);
        return sortArray(leftArray, rightArray);
    }

    private int[] sortArray(int[] leftArray, int[] rightArray) {
        int leftArrayPointer = 0;
        int rightArrayPointer = 0;

        int resultSize = leftArray.length + rightArray.length;
        int[] result = new int[resultSize];

        for (int i = 0; i < resultSize; i++) {
            if (leftArray[leftArrayPointer] < rightArray[rightArrayPointer]) {
                result[i] = leftArray[leftArrayPointer];
                leftArrayPointer++;
            } else if (leftArray[leftArrayPointer] > rightArray[rightArrayPointer]) {
                result[i] = rightArray[rightArrayPointer];
                rightArrayPointer++;
            } else {
                result[i] = leftArray[leftArrayPointer];
                i++;
                result[i] = rightArray[rightArrayPointer];
                leftArrayPointer++;
                rightArrayPointer++;
            }

            if (leftArrayPointer >= leftArray.length) {
                while (rightArrayPointer < rightArray.length) {
                    i++;
                    result[i] = rightArray[rightArrayPointer];
                    rightArrayPointer++;
                }
            }

            if (rightArrayPointer >= rightArray.length) {
                while (leftArrayPointer < leftArray.length) {
                    i++;
                    result[i] = leftArray[leftArrayPointer];
                    leftArrayPointer++;
                }
            }
        }

        return result;
    }

}
