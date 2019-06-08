package ru.job4j.condition;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {
    /**
     * Method max- returners the higher number of
     * the 2 entered.
     * @param left input parameter
     * @param right input parameter
     * @return higher number
     */
    public int max(int left, int right) {
        int result = left >=  right ? left : right;
        return result;
    }
}