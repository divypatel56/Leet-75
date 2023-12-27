package com.company;

public class Q8_IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
       int firstMin=Integer.MAX_VALUE;
       int secondMin=Integer.MAX_VALUE;

       for(int num : nums){
           if (num<=firstMin) {
               firstMin = num;
           }
           else if(num<= secondMin){
               secondMin = num;
           }
           else{
               return  true;
           }
       }
       return  false;
    }

    public static void main(String[] args) {
        Q8_IncreasingTripletSubsequence n = new Q8_IncreasingTripletSubsequence();
        System.out.println(n.increasingTriplet(new int[]{5,4,3,2,1}));
    }
}
