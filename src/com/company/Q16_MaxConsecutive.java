package com.company;

public class Q16_MaxConsecutive {
    public static void main(String[] args) {
        Q16_MaxConsecutive cons = new Q16_MaxConsecutive();
        System.out.println(cons.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    }

    public int longestOnes(int[] nums, int k) {
        // Make 2 pointers
        int i = 0; // Traverse the whole array
        int j = 0; // Keep track of flipped 0

        // Iterate through the array using the 'i' pointer
        while (i < nums.length) {
            // If the current element is 0, decrement the available flips (k)
            if (nums[i] == 0) {
                k--;
            }

            // If the number of available flips becomes negative, adjust the window
            if (k < 0) {
                // If the element at 'j' (left side of the window) is 0, increment k
                if (nums[j] == 0) {
                    k++;
                }
                // Move the left side of the window (j) to the right
                j++;
            }

            // Move the right side of the window (i) to the right
            i++;
        }

        // Return the length of the longest subarray with at most 'k' flipped 0's
        return i - j;
    }
}
