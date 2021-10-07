package com.feng.test1;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        int num=0;
        for (int i=1;i<=100;i++){
            if (i%5!=0){
                System.out.print(i+",");
                num++;
                if (num%5==0){
                    System.out.println();
                }
            }
        }

    }
}
