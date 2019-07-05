package ru.job4j.array;
/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BrotherBear {
    /**
     * Method yearBigger takes
     * @param bear1 weight
     * @param bear2 weight
     * @return how many years it will take for a younger bear to
     * become bigger that an older bear
     */
    public int yearBigger(int bear1, int bear2) {
        int n;
        for (n = 1; n < 6; n++) {
            bear1 = bear1 + (bear1 * 3 * n);
            bear2 = bear2 + (bear2 * 2 * n);
            if (bear1 > bear2) {
                break;
            }
        }
        return n;
    }
}
