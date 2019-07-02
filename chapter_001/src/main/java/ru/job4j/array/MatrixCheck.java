package ru.job4j.array;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * Method mono
     * @param data array
     * @return if all item in the aray are "true" of "false"
     * in 2 diagonals
     */

    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0][0] != data[i][i]) {
                result = false;
                break;
            }
            if (data[0][data.length - 1] != data[i][data.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
