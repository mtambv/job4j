package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array){
        List<Integer> list = new ArrayList<>();
        int listIndex =0;
         for (int [] rows : array) {
            for (int cells : rows) {
                list.add (listIndex++, cells);
            }
        }
        return list;
    }
}