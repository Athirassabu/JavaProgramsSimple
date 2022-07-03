package com.programs;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String s="ahghjdss%vjjkk jjkigt&";
        String newString=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(newString);
    }
}
