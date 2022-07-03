package com.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccuranceWord {
    public static void main(String[] args) {
        String word="I am am Athira Sabu Sabu";
        String[] splitWord=word.split(" ");
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<splitWord.length;i++)
        {
            if(!map.containsKey(splitWord[i]))
            {
                map.put(splitWord[i],1);
            }
            else
            {
                int value=map.get(splitWord[i]);
                map.put(splitWord[i],value+1);
            }
        }
        System.out.println(map);
    }
}
