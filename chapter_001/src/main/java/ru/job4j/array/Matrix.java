package ru.job4j.array;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Matrix {

    /**
     * Method multiple
     *
     * @param size of matrix
     * @return multiplication table
     */

    int[][] multiple(int size) {
        int [][] table = new int [size] [size];
        int count = 0;
for (int out = 0; out!= size; out ++) {
    for (int inner = 0; inner != size; inner++) {

        table[out] = (table[out * inner]);
             table[inner] = (table[out * inner]);
            count++;

    }
}
        return table;
    }
}
