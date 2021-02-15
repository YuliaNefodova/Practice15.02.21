public class QuickSort {
    //task 1
    public int[] quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return array;

        if (low >= high)
            return array;

        int middle = low + (high - low) / 2;
        int supportElement = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < supportElement) {
                i++;
            }

            while (array[j] > supportElement) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
        return array;
    }

}

