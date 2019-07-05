package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class MergerTest {
        @Test
        public void when2EqualArraysReturnSorted() {
            Merger merger = new Merger();
            int[] input1 = new int[] {1, 2, 3};
            int[] input2 = new int[] {4, 5, 6};
            int[] result = merger.merge(input1, input2);
            int[] expect = new int[] {1, 2, 3, 4, 5, 6};
            assertThat(result, is(expect));
        }
        @Test
        public void whenUnequalArraysReturnSorted() {
            Merger merger = new Merger();
            int[] input1 = new int[] {1, 3, 5};
            int[] input2 = new int[] {2, 4, 6, 7, 8, 9};
            int[] result = merger.merge(input1, input2);
            int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
            assertThat(result, is(expect));
        }
}

