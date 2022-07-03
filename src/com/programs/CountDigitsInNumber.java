package com.programs;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        int num=122445;
        int count =0;
        while(num>0)
        {

             num=num/10;
             count++;

        }
        System.out.println("Count="+count);
    }
}
