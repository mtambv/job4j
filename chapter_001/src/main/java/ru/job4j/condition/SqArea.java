package ru.job4j.condition;

public class SqArea {
    /**
     * method square
     *
     * returns length, width, and square of rectangle
     * if we know perimeter and length/width ratio
     *
     * @param p perimeter
     * @param k length/width ratio
     * @return w -длинна
     * @return h -высота
     * @return s - площадь полученного прямоугольника
     */

    public double square(int p, int k) {
        double h = (p / 2) / (k + 1);
        double w = h * k;
        double s = w * h;
        return s;
    }
}