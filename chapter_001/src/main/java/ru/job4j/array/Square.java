package ru.job4j.array;


/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Square {

    /**
     * Method calculate creates an array based on:
     * @param bound =array.length
     * @return  every number in array squared
     */

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 0; i < bound; i++) {

            rst[i] = i + 1;

            rst[i] = (int) Math.pow(rst[i], 2);
        }
        return rst;
    }
}