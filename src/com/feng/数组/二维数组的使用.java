package com.feng.数组;

public class 二维数组的使用 {
    public static void main(String[] args) {
        int[][] arr=new int[3][];//开辟空间
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=new int[i+1];//给每一个分配大小
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=i+1;//赋值
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
