package ru.job4j.condition;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Triangle {


        /**
         * Метод должен вычислить площадь треугольника.
         *
         * Формула.
         *
         * √ p *(p - a) * (p - b) * (p - c)
         *
         * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
         *
         * @return Вернуть площадь, если треугольник существует или -1.
         */


        public  double area (int x1, int y1, int x2, int y2, int x3, int y3) {
            double rsl = 0;
            double a = new Triangle().distance(x1, y1, x2, y2);
            double b = new Triangle().distance(x2, y2, x3, y3);
            double c = new Triangle().distance(x1, y1, x3, y3);
            double p = period(a, b, c);

            if (this.exist(a, b, c)) {
                // формулa для расчета площади треугольника.
                 rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            }
            return rsl;
        }

        /**
         * Метод проверяет можно ли построить треугольник с такими длинами сторон.
         *
         * @param a Длина от точки a b.
         * @param b Длина от точки a c.
         * @param c Длина от точки b c.
         * @return
         */
        public boolean exist(double a, double c, double b) {
            if (a != 0 && b != 0 && c != 0 && a+ b > c  &&  b+c > a &&  a+c  > b ) ;
            {
                return true;
            }
        }

        /**
         * Method distance
         *
         * @param x1,y1,x2,y2 input coordinate
         * @return distance between 2 points
         */

        public double distance(int x1, int y1, int x2, int y2) {
            double first = Math.pow(x2 - x1, 2);
            double second = Math.pow(y2 - y1, 2);
            return Math.sqrt(first + second);
        }


    /**
     * Метод вычисления полупериметра по длинам сторон.
     * <p>
     * Формула:(a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полуперимента.
     */
    public double period(double a, double b, double c) {

        double p = (a + b + c) / 2;
        return p;
    }
}


