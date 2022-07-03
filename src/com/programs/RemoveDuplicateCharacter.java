package com.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String word = "jaaava";
        char[] c = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < c.length; i++) {
            set.add(c[i]);
        }
        for (Character ch : set) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
