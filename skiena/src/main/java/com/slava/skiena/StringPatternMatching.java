package com.slava.skiena;

/**
 * Created by slavic on 8/21/14.
 */
public class StringPatternMatching {

    public static int findMatch(String text, String s) {
        int textLen = text.length();
        int sLen = s.length();

        for (int i = 0, len = textLen - sLen + 1; i < len; i++) {
            int j = 0;
            while (j < sLen && text.charAt(i + j) == s.charAt(j)) {
                j++;
            }
            if (j == sLen) {
                return i;
            }
        }
        return -1;
    }
}
