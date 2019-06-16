package ru.job4j.array;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Check {

    /**
     * Method mono takes
     * @param data -input boolean array
     * @return- wheather arrray contain all "true" or all  "false" values
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
                result = true;
            }

             }
        return result;
        }


    }




