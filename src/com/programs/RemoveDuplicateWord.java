package com.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {
    public static void main(String[] args) {
        String word="I am am Athira Sabu Sabu";
        String[] splitWord=word.split(" ");
        Set<String> set=new LinkedHashSet<>();
        for(int i=0;i<splitWord.length;i++)
        {
            set.add(splitWord[i]);
        }
        for(String ch:set)
        System.out.print(ch+ " ");
    }
}
