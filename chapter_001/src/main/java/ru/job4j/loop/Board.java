package ru.job4j.loop;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Board {

    /**
     * Method paint
     *
     * takes 2 numbers and draws a checkerboard
     *
     * @param width of checkerboard
     *
     * @param height of checkerboard
     * @return drawn checkerboard of X's
     */

    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}

