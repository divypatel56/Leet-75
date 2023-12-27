package com.company;

public class Q11_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sPtr=0;
        int tPtr=0;
        while(sPtr < s.length() && tPtr< t.length()){
            if(s.charAt(sPtr) == t.charAt(tPtr)){
                sPtr++;
            }
            tPtr++;
        }
        return sPtr == s.length();
    }

    public static void main(String[] args) {
        Q11_IsSubsequence s = new Q11_IsSubsequence();
        System.out.println(s.isSubsequence("axc","ahbgdc"));
    }
}
