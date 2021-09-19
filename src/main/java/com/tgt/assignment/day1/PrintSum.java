package com.tgt.assignment.day1;

import java.util.Scanner;

public class PrintSum {

    public static int[] sumOfEvensAndOdds(int []nums) {
        int []res=new int[2];
        int even=0,odd=0;
        for(int i=0;i<nums.length;i++){
            if(i%2!=0)
                even+=nums[i];
            else
                odd+=nums[i];
        }
        res[0]=even;
        res[1]=odd;
        return res;
    }

    public static void main(String[] args){

        int nums[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum[]=sumOfEvensAndOdds(nums);
        System.out.println("The sum of even numbers in the array: "+sum[0]);
        System.out.println("The sum of odd numbers in the array: "+sum[1]);
    }
}
