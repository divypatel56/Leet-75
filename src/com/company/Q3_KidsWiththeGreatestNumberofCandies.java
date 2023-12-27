package com.company;

import java.util.ArrayList;
import java.util.List;

public class Q3_KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result= new ArrayList<Boolean>();
        int max=0;
        for(int i : candies){
            max = Math.max(max,i);
        }
        for(int i: candies){
            if(i+ extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Q3_KidsWiththeGreatestNumberofCandies kid = new Q3_KidsWiththeGreatestNumberofCandies();
        System.out.println(kid.kidsWithCandies(new int[]{12,1,12},10));
    }
}
