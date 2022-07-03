package com.programs;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr={4,26,7,8,12,3};
        int min = arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        System.out.println("Min is:"+min);

    }
}
