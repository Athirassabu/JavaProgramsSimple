package com.programs;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=reader.nextInt();
        int b=reader.nextInt();
       /*
      //  step 1:
        int temp=0;
        temp=a;
        a=b;
        b=temp;*/

        //step 2

       /*
        a=a+b;
        b=a-b;
        a=a-b;
        */

        //Step 3
        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("a value is:"+a);
        System.out.println("b value is:"+b);
    }
}
