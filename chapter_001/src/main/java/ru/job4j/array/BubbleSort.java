package ru.job4j.array;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class BubbleSort {
    /**
     * method sort takes:
     * @param array as input
     * @return sorted array
     */

    public int[] sort(int[] array) {
        boolean swap = true;
        int n = array.length;
        for (int i = 0; i < n - 1; i++)

            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    swap = false;
                    // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    if (swap) {
                        break;
                    }
                }
        return array;
    }
}
