package sorting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class QuickSortTest {
    @Test
    public void testNull() {
        int[] array = null;
        QuickSort.quickSort(array, 0, 0);
        assertNull(array);
    }

    @Test
    public void testEmpty() {
        int[] array = {};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertEquals(0, array.length);
    }

    @Test
    public void testSingleElementArray() {
        int[] array = {0};
        int[] expected = {0};
        QuickSort.quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);
        }
    }

    @Test
    public void testOddSizedArray() {
        int[] array = {3, 2, 4, 1, 5};
        int[] expected = {1, 2, 3, 4, 5};
        QuickSort.quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);
        }
    }

    @Test
    public void testEvenSizedArray() {
        int[] array = {6, 3, 2, 4, 1, 5};
        int[] expected = {1, 2, 3, 4, 5, 6};
        QuickSort.quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);
        }

        System.out.println("Completed QuickSort tests.");
    }
}
