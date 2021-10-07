package com.feng.test1;

import java.util.Scanner;

//多重循环练习
public class practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum=0;
        int passNum=0;
        for (int i = 1; i <=3 ; i++) {
            double sum=0;
            for (int j = 1;j<=5; j++) {
                System.out.println("第"+i+"个班第"+j+"个学生成绩");
                double score = scanner.nextDouble();
                if (score>=60){
                    passNum++;
                }
                System.out.println("成绩为"+score);
                sum+=score;
            }
            System.out.println("总分为"+sum);
            System.out.println("平均为"+sum/5);
            totalSum+=sum;
        }
        System.out.println(totalSum);
        System.out.println("及格人数"+passNum);
    }
}
