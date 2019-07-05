package ru.job4j.array;

/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Merger {
    /**
     * Method merge
     * @param a array
     * @param b array
     * @return 2 arrays merged, sorted
     */
    public static int[] merge(int[] a, int[] b) {

        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                answer[k] = a[i];
                i++;
            } else {
                answer[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            answer[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            answer[k] = b[j];
            j++;
            k++;
        }
        return answer;
    }
}

