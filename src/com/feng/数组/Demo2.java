package com.feng.数组;

public class Demo2 {
    public static void main(String[] args) {
        char[] chars = new char[26];
        for (int i = 0; i < chars.length ; i++) {
            chars[i]=(char) ('A'+i);
        }
        for (int i = 0; i < chars.length ; i++) {
            System.out.println(chars[i]);
        }
    }
}
