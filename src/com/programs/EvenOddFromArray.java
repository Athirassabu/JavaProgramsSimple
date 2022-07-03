package com.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class EvenOddFromArray {
    public static void main(String[] args) {
        int[] arr={34,5,6,7,9,1};
     Set<Integer> setEven=new LinkedHashSet<>();
        Set<Integer> setOdd=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                setEven.add(arr[i]);
            }
            else {
                setOdd.add(arr[i]);
            }
        }
        System.out.println("Even number is:"+setEven);
        System.out.println("Odd number is:"+setOdd);
    }

}
