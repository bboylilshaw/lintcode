package org.jasonxiao.lintcode;

import java.util.Arrays;

/**
 * Created by Jason on 8/7/16.
 * 翻转字符串
 * http://www.lintcode.com/zh-cn/problem/reverse-words-in-a-string/
 */
public class ReverseWordsInAString {
    /**
     * @param s : A string
     * @return : A string
     */
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            if (!array[i].equals("")) {
                sb.append(array[i]).append(" ");
            }
        }

        return sb.toString().trim();
    }
}
