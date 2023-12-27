package com.company;
//Input: nums = [1,2,3,4], k = 5
//Output: 2

import java.util.Arrays;

public class Q13_MaxNumbersK_Sum {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int pair=0;
        int i=0;
        int j=nums.length-1;
        while (i<j){
            if(nums[i]+nums[j] > k){
                j--;
            }
            else if(nums[i]+nums[j]<k){
                i++;
            }
            else{
                i++;
                j--;
                pair++;
            }
        }
            return pair;

    }

    public static void main(String[] args) {
        Q13_MaxNumbersK_Sum k =new Q13_MaxNumbersK_Sum();
        System.out.println(k.maxOperations(new int[]{1,3,4,2},5));
    }
}
