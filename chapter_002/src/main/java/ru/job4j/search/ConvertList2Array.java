package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {
    /**
     * Метод реализует преобразование ArrayList в двухмерный массив,
     * равномерно разбивая его на строки, недостающие элементы заполняем нулями.
     * @param list - Исходнй ArrayList.
     * @param rows - Колличество строк после разбиения.
     * @return Результат.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (list.size() % rows != 0) ? list.size() / rows + 1 : list.size() / rows;
        int[][] array = new int[rows][cells];
        int rowIndex = 0, cellIndex = 0;
        for (Integer item : list) {
            array[rowIndex][cellIndex] = item;
            cellIndex++;
            if (cellIndex == cells) {
                rowIndex++;
                cellIndex = 0;
            }
        }
        if (cellIndex != 0) {
            for (int index = cellIndex; index < cells; index++) {
                array[rowIndex][cellIndex] = 0;
            }
        }
        return array;
    }
    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] array : list) {
            for (int item : array) {
                result.add(item);
            }
        }
        return result;
    }


}