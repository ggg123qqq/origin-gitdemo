package com.feng.数组;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr={1,2,3};
        do {
            int[] arr2 = new int[arr.length+1];
            for (int i = 0; i < arr.length ; i++) {
                arr2[i]=arr[i];
            }
            System.out.println("请输入你要添加的元素");
            arr2[arr2.length-1]=scanner.nextInt();
            //让arr指向arr2
            arr=arr2;
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]);
            }
            //问用户是否继续
            System.out.println("是否继续添加?");
            char key = scanner.next().charAt(0);
            if (key=='n'){
                System.out.println("你退出了添加");
                break;

            }
        }while (true);

    }
}
