package ru.job4j.array;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Turn {

    /**
     * Metod back takes
     * @param array input
     * @return array reversed
     */
    public int[] back(int[] array) {
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            // swap the values at the left and right indices
            int temp = array[left];
            array[left]  = array[right];
            array[right] = temp;
        }
        return array;
    }

}




