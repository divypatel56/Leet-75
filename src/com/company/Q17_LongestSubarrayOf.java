package com.company;
//Given a binary array nums, you should delete one element from it.
//Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

//Example 2:
//
//Input: nums = [0,1,1,1,0,1,1,0,1]
//Output: 5
//Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of
// 1's is [1,1,1,1,1].

public class Q17_LongestSubarrayOf {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int zeroCounter=1;
        while(i<nums.length){
            if(nums[i]==0){
                zeroCounter--;
            }
            if(zeroCounter < 0){

                if(nums[j]==0){
                    zeroCounter ++;
                }
                j++;
            }
            i++;
        }
    return i-j-1;
    }

    public static void main(String[] args) {
        Q17_LongestSubarrayOf num = new Q17_LongestSubarrayOf();
        System.out.println(num.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
    }
}
