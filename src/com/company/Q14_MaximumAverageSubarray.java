package com.company;
//Input: nums = [1,12,-5,-6,50,3], k = 4
//Output: 12.75000
//Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
public class Q14_MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum=0;
        for (int i = 0; i < k; i++) {
            maxSum+=nums[i];
        }
        double prevSum=maxSum;
        for (int i = 1; i <nums.length-k+1 ; i++) {
            double sum= prevSum-nums[i-1]+nums[i+k-1];
            prevSum=sum;
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum/k;

    }

    public static void main(String[] args) {
        Q14_MaximumAverageSubarray array = new Q14_MaximumAverageSubarray();
        System.out.println(array.findMaxAverage(new int[]{3},1));
    }
}
