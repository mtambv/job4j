package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */


    public class Paint {

    /**
     * Method rightTrl draws right side of pyramid
     *
     * @param height of pyramid
     *
     * @return right side of pyramid
     */

    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }
    /**
     * Method leftTrl draws left side of pyramid
     *
     * @param height of pyramid
     *
     * @return right side of pyramid
     */

    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }


    /**
     * Method pyramid
     *
     * combines 2 previous methods rightTrl and leftTrl
     *
     * @param height of pyramid
     *
     * @return complete pyramid
     */

    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * Method loopBy
     *
     * @param height input parameter
     * @param widht  input parameter
     * @param predict predicate input parameter
     * @return  parameters for pyramid Method
     */

    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}