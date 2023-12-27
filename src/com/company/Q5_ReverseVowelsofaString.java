package com.company;
//To reverse only the vowels in the string s, you can follow these steps in Java:

//Convert the input string s to a character array for easy manipulation.
//Create two pointers, one at the beginning of the array (i.e., the left side) and the other at the end (i.e., the right side).
//Loop through the array with these two pointers while checking the following conditions:
//If the character at the left pointer is a vowel and the character at the right pointer is a vowel, swap them.
//Move the left pointer to the right, and the right pointer to the left, both towards the center of the array.
//Continue these swaps until the left pointer crosses or meets the right pointer.
//After the loop, convert the character array back to a string.

public class Q5_ReverseVowelsofaString {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        String vowels = "aeiouAEIOU";

        while (left < right){
            while (left < right && !vowels.contains(ch[left]+"")){
                left++;
            }
            while(left < right && !vowels.contains(ch[right]+"")){
                right--;
            }
            char temp = ch[left];
            ch[left]=ch[right];
            ch[right]=temp;

            left++;
            right--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Q5_ReverseVowelsofaString s =new Q5_ReverseVowelsofaString();
        System.out.println(s.reverseVowels("hello"));
    }
}
