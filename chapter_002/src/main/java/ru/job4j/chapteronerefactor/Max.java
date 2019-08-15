package ru.job4j.chapteronerefactor;

public class Max {

    public int max(int first, int second) {
        int result = first >=  second ? first : second;
        return result;
    }
    public int max(int first, int second, int third) {
        int temp = max(second, third);
        return max(first, temp);
    }
    public int max(int first, int second, int third, int fourth) {
        int temp1 = max(first, second);
        int temp2 = max(third, fourth);
        int result = max(temp1, temp2);
        return result;
    }
}

