package com.feng.数组;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
      double[] scores=new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length ; i++) {
            System.out.println("请输入第"+(i+1)+"个元素");
            scores[i] = scanner.nextDouble();
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
