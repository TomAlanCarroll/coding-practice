package sorting;

public class QuickSort {
    /**
     * Implementation of recursive quicksort
     * @param array The array of integers to sort
     * @param lowIndex The low index sorting; Should be 0 initially
     * @param highIndex The high index of the sorting; Should be array.length - 1 initially
     */
    public static void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partition(array, lowIndex, highIndex);
            if (partitionIndex > 1) {
                quickSort(array, lowIndex, partitionIndex - 1);
            }
            if (partitionIndex + 1 < highIndex) {
                quickSort(array, partitionIndex + 1, highIndex);
            }
        }
    }

    private static int partition(int[] array, int lowIndex, int highIndex) {
        // use the lowIndex as the pivot
        int pivot = array[lowIndex];

        while (true) {
            while (array[lowIndex] < pivot) {
                lowIndex++;
            }

            while (array[highIndex] > pivot) {
                highIndex--;
            }

            if (lowIndex < highIndex) {
                int temp = array[highIndex];
                array[highIndex] = array[lowIndex];
                array[lowIndex] = temp;
            } else {
                return highIndex;
            }
        }
    }
}
