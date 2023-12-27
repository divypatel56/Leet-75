package com.company;

public class Q12_ContainersmostWaters {
    public int maxArea(int[] height) {
        int maxArea=0;
        int left =0;
        int right = height.length-1;
        while (left < right){
            int minHeight = Math.min(height[left],height[right]);
            int currentArea= (right-left) * minHeight;
            maxArea = Math.max(maxArea,currentArea);

            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;

    }

    public static void main(String[] args) {
        Q12_ContainersmostWaters h = new Q12_ContainersmostWaters();
        System.out.println(h.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
