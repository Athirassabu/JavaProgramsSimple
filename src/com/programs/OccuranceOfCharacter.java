package com.programs;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter {
    public static void main(String[] args) {
        String word="AthiraSabuu";
        char[] c=word.toCharArray();
        Map<Character,Integer> map=new HashMap();
        for(int i=0;i<c.length;i++)
        {
            if (!map.containsKey(c[i]))
            {
                map.put(c[i],1);
            }
            else
            {
                int value = map.get(c[i]);
                map.put(c[i],value+1);
            }

        }
        System.out.println(map);
    }
}
