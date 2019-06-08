package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        double weightM = (height - 100) * 1.15;
        return weightM;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        double weightW = (height - 110) * 1.15;
        return weightW;
    }
}
