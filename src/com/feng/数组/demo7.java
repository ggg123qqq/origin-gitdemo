package com.feng.数组;

import java.util.Scanner;

//动态缩减
public class demo7 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        Scanner scanner = new Scanner(System.in);
        do {
            int[] arr2=new int[arr.length-1];
            System.out.println("是否进行缩减,y:是/n:否");
            char key = scanner.next().charAt(0);
            if (key=='n'){
                System.out.println("你退出了缩减");
                break;
            }
            if (arr.length==1){
                System.out.println("数组长度为1，不能缩减");
                break;
            }
            for (int i = 0; i <arr.length-1 ; i++) {
                arr2[i]=arr[i];
            }
            arr=arr2;
            for (int i = 0; i < arr2.length ; i++) {
                System.out.println(arr2[i]);
            }
        }while (true);

    }
}
