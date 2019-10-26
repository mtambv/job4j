package ru.job4j.search;

import java.util.Comparator;

public class ListCompare implements Comparator <String> {
    @Override
    public int compare(String left, String right) {
        int size = left.length();
        if (left.length() < right.length()) {
            size = right.length();
        }
        char[] first = toCharArray(size, left);
        char[] second = toCharArray(size, right);
        int result = 0;
        for (int index = 0; index < size; index++) {
            result = Character.compare(first[index], second[index]);
            if (result != 0) {
                break;
            }
            else {
                result = Integer.compare(left.length(), right.length());
            }
        }
        return result;
    }

    private char[] toCharArray(int size, String string) {
        char[] values = new char[size];
        for (int index = 0; index < string.length(); index++) {
            values[index] = string.charAt(index);
        }
        return values;
    }
}