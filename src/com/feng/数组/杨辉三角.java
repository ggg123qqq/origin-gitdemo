package com.feng.数组;

public class 杨辉三角 {
    public static void main(String[] args) {
        int[][] arr=new int[20][];
        for (int i = 0; i <arr.length ; i++) {
            //给每一个一维数组开辟空间
            arr[i]=new int[i+1];
            for (int j = 0; j <arr[i].length ; j++) {
                if (j==0||j==arr[i].length-1){
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
