package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        // тест, проверяющий сортировку массива из 10 элементов методом пузырька.
        BubbleSort  bubbleSort = new BubbleSort();
        int[] input = new int[] {3, 2, 4, 5, 6, 7, 8, 9, 0, 1};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortArrayAlltheSame() {
        // тест, проверяющий сортировку массива из 10 элементов методом пузырька.
        BubbleSort  bubbleSort = new BubbleSort();
        int[] input = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertThat(result, is(expect));
    }
}


