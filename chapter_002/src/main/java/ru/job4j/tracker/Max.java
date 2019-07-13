package ru.job4j.tracker;

public class Max {


    public int max(int first, int second) {
        int result = first >=  second ? first : second;
        return result;
    }
    public int max(int first, int second, int third) {
        int temp = first > second ? first : second;
        int result = third > temp ? third : temp;
        return result;
    }
    public int max(int first, int second, int third,int fourth) {
        int temp1 = first > second ? first : second;
        int temp2 = third > fourth ? third : fourth;
        int result = temp1 > temp2 ? temp1 : temp2;
        return result;
    }
}
