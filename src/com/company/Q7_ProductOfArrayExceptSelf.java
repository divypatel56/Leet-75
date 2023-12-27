package com.company;
//Initialize two arrays, leftProduct and rightProduct, both of the same length as the input array nums.

//leftProduct will store the product of all elements to the left of the current element in nums, and rightProduct will store the product of all elements to the right of the current element in nums.

//Initialize the answer array to store the final results.

//Calculate the leftProduct array by iterating through nums from left to right. Start with leftProduct[0] = 1, and for each subsequent element, calculate the product by multiplying it with the previous element in leftProduct.

//Calculate the rightProduct array by iterating through nums from right to left. Start with rightProduct[nums.length - 1] = 1, and for each subsequent element, calculate the product by multiplying it with the previous element in rightProduct.

//Finally, calculate the answer array by multiplying leftProduct[i] and rightProduct[i] for each index i in nums.
public class Q7_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int[] answer = new int[n];

        //Calculate left product
        left[0]=1;
        for (int i = 1; i < n; i++) {
            left[i]= left[i-1] * nums[i-1];
        }

        //calculate right product
        right[n-1]=1;
        for (int i = n-2; i >=0 ; i--) {
            right[i]=right[i+1]* nums[i+1];
        }

        for (int i = 0; i < n; i++) {
            answer[i]= left[i] * right[i];
        }

    return  answer;
    }

    public static void main(String[] args) {
        Q7_ProductOfArrayExceptSelf n = new Q7_ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] answer = n.productExceptSelf(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(answer[i] +" ");

        }
    }
}
