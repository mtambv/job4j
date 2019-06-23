package ru.job4j.array;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        boolean result = true;
        int size = data.length - 1;
        for (int out = 0; out != size; out++) {
            for (int inner = 0; inner != size; inner++) {
                if (data[out][inner] != data[out + 1][inner + 1] ) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}