package com.company;
//Example 1:
//
//Input: s = "abciiidef", k = 3
//Output: 3
//Explanation: The substring "iii" contains 3 vowel letters.
public class Q15_MaxNoOfVowelsSunString {
    public int maxVowels(String s, int k) {
        int vowels=0;
        for (int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))){
                vowels++;
            }
        }
        int maxVowels = vowels;
        for (int i = k; i < s.length() ; i++) {
            if(isVowel(s.charAt(i-k))){
                vowels --;
            }
            if(isVowel(s.charAt(i))){
                vowels ++;
            }
            maxVowels = Math.max(maxVowels ,vowels);
        }
        return maxVowels;
    }
    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

    public static void main(String[] args) {
        Q15_MaxNoOfVowelsSunString s = new Q15_MaxNoOfVowelsSunString();
        System.out.println(s.maxVowels("abciiidef",3));
    }
}
