package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointOopTest {
    @Test
    public void whenZeroAndTenThenTen() {
        PointOop first = new PointOop(0, 0);
        PointOop second = new PointOop(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    @Test
    public void whenCheckItself() {
        PointOop point = new PointOop(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    @Test
    public void whenShowInfo() {
        PointOop first = new PointOop(1, 1);
        first.info();
        PointOop second = new PointOop(2, 2);
        second.info();
    }
}