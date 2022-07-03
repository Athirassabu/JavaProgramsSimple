package com.programs;

public class CountWordsInString {
    public static void main(String[] args) {
        String word="I am Athira Sabu";
        String space=" ";
        int count=0;
        String newWord=word+space;
        char[] c=newWord.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
