package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(int value) {
        double euro= value/70;
        return euro;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public double rubleToDollar(int value) {
        double dollar= value/60;
        return dollar;
    }
}