package com.feng.数组;

import java.util.Scanner;

public class 二维数组练习2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要插入的数字");
            int[] arr={10,20,30,40,50};
            int insertNum = scanner.nextInt();
            int index=-1;
            for (int i = 0; i < arr.length ; i++) {
                if (insertNum<arr[i]){
                    index=i;
                    break;//找到位置后就停止了
                }
            }
            if (index==-1){
                index= arr.length;
            }
            //System.out.println("index="+index);
            int[] arr2=new int[arr.length+1];
            //进行插入，
            for (int i = 0,j=0; i < arr2.length ; i++) {
                if (i!=index){
                    arr2[i]=arr[j];
                    j++;
                }else {
                    arr2[i]=insertNum;
                }
            }

            //遍历数组
            for (int i = 0; i < arr2.length ; i++) {
                System.out.print(arr2[i]+" ");
            }
    }
}
