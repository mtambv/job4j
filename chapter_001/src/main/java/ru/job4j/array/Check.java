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
     * @return- wheather arrray contain all "true" or "false" values
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] = true) {
                result = true;
            }
             if (data[i] = false) {
              result = true;
             }
        }
        return result;

    }
}



