class InsertionSort {

    void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int valueToInsert = array[i];
            for (int j = 0; j < i; j++) {
                if (valueToInsert < array[j]) {
                    insertIntoArray(array, j, i);
                    break;
                }
            }
        }
    }

    private void insertIntoArray(int[] array, int indexOfValueToInsert, int indexOfValueToRemove) {
        int valueToInsert = array[indexOfValueToRemove];
        shiftValueOfArray(array, indexOfValueToInsert, indexOfValueToRemove);
        array[indexOfValueToInsert] = valueToInsert;
    }

    private void shiftValueOfArray(int[] array, int indexOfValueToInsert, int indexOfValueToRemove) {
        if (indexOfValueToRemove - indexOfValueToInsert >= 0) {
            System.arraycopy(
                    array,
                    indexOfValueToInsert,
                    array,
                    indexOfValueToInsert + 1,
                    indexOfValueToRemove - indexOfValueToInsert);
        }
    }
}
