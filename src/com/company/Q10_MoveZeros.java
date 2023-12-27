package com.company;

public class Q10_MoveZeros {
    public void moveZeroes(int[] nums) {
        //[0,1,0,2,3] --->> [1,2,3,0,0]
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=0 ){
                int temp = nums[i];
                nums[i]=nums[ptr];
                nums[ptr]=temp;
                ptr++;

            }

        }

    }

    public static void main(String[] args) {
        Q10_MoveZeros z = new Q10_MoveZeros();
        int[] nums = new int[]{1,0,0,2,3};
        z.moveZeroes(nums);
        for (int i: nums) {
            System.out.print(i);
        }
    }
}
