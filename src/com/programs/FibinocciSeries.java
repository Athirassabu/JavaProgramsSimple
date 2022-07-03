package com.programs;

public class FibinocciSeries {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int c = 0;
        int num=10;
        for(int i=0;i<=8;i++)
        {
           c=a+b;
           a=b;
           b=c;
        if(c==num) {
            System.out.println("FibinocciSeries");
        }
        }
    }
}
