class BubbleSort {

  void sort(int[] array) {

    for (int i = 0; i < array.length; i++) {
      for (int j = 1; j < array.length; j++) {
        if (array[j] < array[j - 1]) {
          swapArrayElements(array, j, j - 1);
        }
      }
    }
  }

  private void swapArrayElements(int[] array, int index1, int index2) {
    int tempInt = array[index1];
    array[index1] = array[index2];
    array[index2] = tempInt;
  }
}
