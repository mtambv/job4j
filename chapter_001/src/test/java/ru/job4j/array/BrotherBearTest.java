package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class BrotherBearTest {
    @Test
    public void whenWeightsAre4and7Then2() {
        BrotherBear bear = new BrotherBear();
        int input1 = 4;
        int input2 = 7;
        int result = bear.yearBigger(input1, input2);
        int expect = 2;
        assertThat(result, is(expect));
    }
    @Test
    public void whenWeightsAre4and9Then3() {
        BrotherBear bear = new BrotherBear();
        int input1 = 4;
        int input2 = 9;
        int result = bear.yearBigger(input1, input2);
        int expect = 3;
        assertThat(result, is(expect));
    }
}
