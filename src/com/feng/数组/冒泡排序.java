package com.feng.数组;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int temp;
        boolean flag=true;
        for (int i = 0; i < arr.length-1 ; i++) {//一共比较几轮
            for (int j = 0; j < arr.length-i-1 ; j++) {//每轮比较几个数
                if (arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=false;
                }
                if (flag=true){
                    break;
                }
            }
            System.out.println("\n第"+(i+1)+"轮");
            for (int k = 0; k < arr.length ; k++) {
                System.out.print(arr[k]+"\t");
            }
        }

    }
}
/*
长度 8
1   7
2   6
3   5*/
