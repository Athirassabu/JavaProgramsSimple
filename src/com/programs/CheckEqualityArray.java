package com.programs;

import java.util.Arrays;

public class CheckEqualityArray {
    public static void main(String[] args) {
        int[] arrayOne={39,5,6,7,8};
        int[] arrayTwo={34,5,6,7,8};
       boolean equals= Arrays.equals(arrayOne,arrayTwo);
       if(equals==true)
       {
           System.out.println("Array is equal");
       }
       else
           System.out.println("Array is not equal");
    }
}
