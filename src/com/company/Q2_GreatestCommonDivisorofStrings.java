package com.company;

public class Q2_GreatestCommonDivisorofStrings {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int divisorStr =  gcd(str1.length(),str2.length());
        return str1.substring(0,divisorStr);



    }
    private int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a % b);

    }

    public static void main(String[] args) {
        Q2_GreatestCommonDivisorofStrings str = new Q2_GreatestCommonDivisorofStrings();
        System.out.println(str.gcdOfStrings("ABABAB","ABAB"));
    }
}
