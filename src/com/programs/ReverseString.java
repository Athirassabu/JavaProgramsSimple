package com.programs;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String word=reader.nextLine();
        char[] c=word.toCharArray();
        String rev="";
        for(int i=c.length-1;i>=0;i--)
        {
            rev=rev+c[i];
        }
        System.out.println("Reverse a string is:"+rev);
    }
}
