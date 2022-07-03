package com.programs;

import java.util.Random;

public class GenerateRandomNUmberString {
    public static void main(String[] args) {
        Random rand=new Random();
        int randnum=rand.nextInt(10);
        System.out.println(randnum);


    }
}
