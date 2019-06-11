package ru.job4j.condition;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class MultiMax {
    /**
     * Mthod max takes 3 numbers and returns the highest
     *
     * @param first  input parameter
     * @param second input parameter
     * @param third  input parameter
     * @return the highest number
     */

    public int max(int first, int second, int third) {

        int temp = first > second ? first : second;
        int result = third > temp ? third : temp;
        return result;
    }
}