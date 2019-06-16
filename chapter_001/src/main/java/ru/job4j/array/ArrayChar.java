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
        int k = pref.length;
        char [] wrd2 = Arrays.copyOf(wrd,k);

        if (Arrays.equals(wrd2,pref)) {
            result = true;
    }
        return result;

    }
}