package ru.job4j.loop;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Counter {

    /**
     * Method add takes the range of numbers
     *
     * @param start  1-st number in the range
     * @param finish last number in the range
     * @return the sum of all even numbers in the range
     */

    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

