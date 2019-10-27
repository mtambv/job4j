package ru.job4j.search;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }
    @Test
    public void when6ElementsThen6() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6),
                2
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertThat(result, is(expect));
    }
    @Test
    public void when9ElementsThen10() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
                5
        );
        int[][] expect = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 0}
        };
        assertThat(result, is(expect));
    }
    @Test
    public void when2ArraysInListToList() {
        ConvertList2Array list = new ConvertList2Array();
        List<Integer> result = list.convert(
                Arrays.asList(new int[] {1, 2}, new int[] {3, 4, 5, 6})
        );
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(result, is(expect));
    }

    @Test
    public void when3ArraysInListToList() {
        ConvertList2Array list = new ConvertList2Array();
        List<Integer> result = list.convert(
                Arrays.asList(new int[] {1, 2},
                        new int[] {3, 4, 5, 6},
                        new int[] {100, 0})
        );
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 100, 0);
        assertThat(result, is(expect));
    }

}