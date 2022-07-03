package com.programs;

public class SumOfElementsINArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,34};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of numbers is:"+sum);
    }
}
