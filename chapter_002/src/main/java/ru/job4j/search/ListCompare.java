package ru.job4j.search;

import java.util.Comparator;

public class ListCompare implements Comparator<String> {
        public int compare(String left, String right) {
            int result = 0;
            for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
                result = Character.compare(left.charAt(i), right.charAt(i));
                    if (result != 0) {
                        break;
                }
            }
                if (result == 0) {
                    result = Integer.compare(left.length(), right.length());
            }
            return result;
        }
    }
