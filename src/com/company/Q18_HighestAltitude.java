package com.company;

//Example 1:
//Input: gain = [-5,1,6]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

public class Q18_HighestAltitude {
    public int largestAltitude(int[] gain) {
            int maxAltitude=0;
            int currentAltitude =0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            maxAltitude = Math.max(currentAltitude,maxAltitude);
        }

        return maxAltitude;

    }

    public static void main(String[] args) {
        Q18_HighestAltitude alt = new Q18_HighestAltitude();
        int[] num = new int[]{52,-91,72};
        System.out.println(alt.largestAltitude(num));

    }
}
