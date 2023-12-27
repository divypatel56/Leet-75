package com.company;

public class Q1_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int w1Length = word1.length(), w2Length = word2.length();
            StringBuffer result = new StringBuffer();

            for (int i = 0; i < w1Length || i < w2Length; ++i) {
                if (i < word1.length()) {
                    result.append(word1.charAt(i));
                }
                if (i < word2.length()) {
                    result.append(word2.charAt(i));
                }
            }
            return result.toString();

    }

    public static void main(String[] args) {
        Q1_MergeStringsAlternately m = new Q1_MergeStringsAlternately();
        System.out.println(m.mergeAlternately("","acty"));
    }
}
