package com.programs;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] arr={2,34,5,6,8,1,8,1,22,77};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
