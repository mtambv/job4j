package ru.job4j.loop;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {
    /**
     * Method calc
     * <p>
     * returns factorial of the entered number
     * @param n parameter entered
     * @return factorial of n
     */

    public int calc(int n) {
        int result = 1;
        int i = 0;
        for (i = 2; i <= n; i++) {
            result *= i; }
            return result;
        }
    }
