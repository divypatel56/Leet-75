package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q20_DifferenceOfArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> num1List = new ArrayList<Integer>();
        List<Integer> num2List = new ArrayList<Integer>();

        //2. Make HashSet and store arrays to avoid repetition.
        HashSet<Integer> num1Set = new HashSet<Integer>();
        HashSet<Integer> num2Set = new HashSet<Integer>();

        for(int num : nums1){
            num1Set.add(num);
        }
        for(int num : nums2){
            num2Set.add(num);
        }

        for(int n : num1Set){
            if(!num2Set.contains(n)){
                num1List.add(n);
            }
        }
        for(int n : num2Set){
            if(!num1Set.contains(n)){
                num2List.add(n);
            }
        }

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(num1List);
        res.add(num2List);

        return res;

    }
}
