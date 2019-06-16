package ru.job4j.array;

import java.util.AbstractCollection;
import java.util.Arrays;
/**
 * @author Mstislav Tambovtsev (mtambv@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayChar {

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();

        for (int i = 1; i < wrd.length-1; ++i) {

            char a = wrd[i];
                 a = wrd[i+1];

            for (int k = 1; k < pref.length-1; ++k) {

                char b = pref[k];
                    // b = pref[k+1];

                if (b == a) {
                    result = true;
                }
            }

        }
        return result;
    }
}