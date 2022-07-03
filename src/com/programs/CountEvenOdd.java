package com.programs;

public class CountEvenOdd {
    public static void main(String[] args) {

        int num=4567892;
        int evenCount=0;
        int oddCount=0;
        int lastDigit=0;
        while(num>0)
        {
            lastDigit=num%10;
            if(lastDigit%2==0)
            {
                evenCount++;
            }
            else
                oddCount++;
            num=num/10;
        }
        System.out.println("Event count is: "+evenCount);
        System.out.println("Odd count is: "+oddCount);
    }
}
