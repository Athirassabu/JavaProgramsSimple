package com.programs;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int num=reader.nextInt();
          int rev=0;

          while(num>0)
          {
              rev=rev*10+num%10;
              num=num/10;
          }
        System.out.println("Reverse number is:"+rev);
    }
}
