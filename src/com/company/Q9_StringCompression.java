package com.company;

public class Q9_StringCompression {
    public int compress(char[] chars) {
        // Index to track the position where characters are written in the array
        int index=0;
        int i=0; // Iterator to traverse the input character array
        while(i<chars.length){
            char current=chars[i];
            int count =0; // Count of consecutive repeating characters
            // Count the number of consecutive repeating characters
            while (i<chars.length && chars[i]==current){
                i++;
                count++;
            }
            // Write the character to the output array
            chars[index++]=current;
            // If the count is greater than 1, write the count as characters
            if(count>1 ){
                String countStr = Integer.toString(count);
                for(char c : countStr.toCharArray()){
                    chars[index++]=c;
                }
            }
        }
            return  index;
    }

    public static void main(String[] args) {
        Q9_StringCompression s = new Q9_StringCompression();
        System.out.println(s.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }
}
