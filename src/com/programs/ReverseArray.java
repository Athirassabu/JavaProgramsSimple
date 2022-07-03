package com.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={2,4,67,89,6};
      Set<Integer> set=new LinkedHashSet<>();

        for(int i=arr.length-1;i>=0;i--)
        {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
