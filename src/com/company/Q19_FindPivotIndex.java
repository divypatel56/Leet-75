package com.company;
//Example 1:
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11

public class Q19_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int pivotIdx = -1;
        int totalSum=0;
        int leftSum=0 ;

        for (int num: nums) {
            totalSum+=num;
        }
        for (int i = 0; i < nums.length; i++) {
            totalSum= totalSum - nums[i];

            if (totalSum==leftSum){
                pivotIdx = i;
            }
            leftSum += nums[i] ;
        }
        return pivotIdx;

    }

    public static void main(String[] args) {
        Q19_FindPivotIndex pivot = new Q19_FindPivotIndex();
        System.out.println(pivot.pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
