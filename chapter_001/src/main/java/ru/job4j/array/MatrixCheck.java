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
     *
     */

    public boolean mono(boolean[][] data) {
        boolean result = true;
        int rowCount = data.length - 1;

        for (int i = 0, j = 0; i < rowCount; i++, j++) {
            if (data[i][j] != data[i + 1][j + 1]) {
                result = false;
            }
            if (data[rowCount][j] != data[rowCount - 1][j + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
