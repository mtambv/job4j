package ru.job4j;

import org.junit.Test;
import ru.job4j.school.Convert;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertTest {

    @Test
    public void whenIntegerMatrixConvertToIntegerListThenIntegerList() {
        Integer[][] integers = new Integer[][]{
                new Integer[]{1, 2},
                new Integer[]{3, 4},
        };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = Convert.toList(integers);
        assertThat(result, is(expected));
    }
}