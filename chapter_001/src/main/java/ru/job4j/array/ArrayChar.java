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
        boolean result = false;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();

        for (int i = 0; i < pref.length; i++) {

            for (int j = 0; j < pref.length; j++) {

                if (pref[i] == wrd[j]) {
                    result = true;
                }
                else {
                    result = false;
                }
            }
        }
        return result;
    }
}
