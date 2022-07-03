package com.programs;

public class SumOfDigits {

    public static void main(String[] args) {
        int num=3687931;
        int lastDigit=0;
        int sum=0;
        while(num>0)
        {
            lastDigit=num%10;
            sum=sum+lastDigit;
            num=num/10;
        }

        System.out.println("Sum of digit is:"+sum);
    }
}
