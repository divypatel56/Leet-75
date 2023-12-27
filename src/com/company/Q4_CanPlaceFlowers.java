package com.company;




public class Q4_CanPlaceFlowers {
    //{0,1,0,0,1}
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
      int count =0;
        for (int i = 0; i <flowerbed.length; i++) {
            if (flowerbed[i]==0) {
                int prev=(i==0 || flowerbed[i-1]==0 )?0:1;
                int next=(i==flowerbed.length-1 || flowerbed[i+1]==0)?0:1;
                if(prev== 0 && next==0){
                    flowerbed[i] =1;
                    count++;
                }
            }
        }
        return count>=n;
    }

    public static void main(String[] args) {
        Q4_CanPlaceFlowers f = new Q4_CanPlaceFlowers();
        System.out.println(f.canPlaceFlowers(new int[]{1, 0, 0,0, 1},2));
    }
}
