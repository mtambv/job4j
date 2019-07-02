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
        return value / 70;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public double rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертируем доллары в рубли  .
     * @param value Доллары.
     * @return рубли
     */
    public double dollarToRuble(int value) {
        return value * 60;
    }
    /**
     * Конвертируем  евро в рубли  .
     * @param value евро.
     * @return рубли
     */
    public double euroToRuble(int value) {
        return value * 70;
    }
}