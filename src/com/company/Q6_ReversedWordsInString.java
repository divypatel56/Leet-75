package com.company;

//To reverse the order of words in a string s in Java, you can use the following approach:
//
//Split the input string s into an array of words. You can use the split method and split by one or more spaces to account for multiple spaces between words. This will also handle leading and trailing spaces.
//
//Create a new string by iterating over the array of words in reverse order and joining them with a single space between each word.
//
//Return the resulting string.
public class Q6_ReversedWordsInString {
    public String reverseWords(String s) {
    String [] words = s.trim().split("\\s+");

    StringBuilder reversed =new StringBuilder();

        for (int i = words.length-1; i >=0 ; i--) {
            reversed.append(words[i]);
            if(i>0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Q6_ReversedWordsInString str = new Q6_ReversedWordsInString();
        System.out.println(str.reverseWords(" The       sky is blue "));


    }
}
