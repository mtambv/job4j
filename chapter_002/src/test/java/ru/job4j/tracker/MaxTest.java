package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.chapter1ReFactor.Max;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenSecondMax() {
        Max check = new Max();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFourthMax() {
        Max check = new Max();
        int result = check.max(1, 4, 2,7);
        assertThat(result, is(7));
    }
    @Test
    public void whenFirstOfTwoMax() {
        Max check = new Max();
        int result = check.max(1, 4);
        assertThat(result, is(4));
    }

}