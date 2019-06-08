package ru.job4j.condition;

/**
 * class Point
 */

public class Point {

    /**
     * Method distance
     *
     * @param x1,y1,x2,y2 input coordinate
     *
     * @return distance between 2 points
     *
     */

    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }
}