package com.feng.数组;
//数组拷贝
public class Demo4 {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,60};
        int[] arr2=new int[arr1.length];
        for (int i = 0; i < arr1.length ; i++) {
                arr2[i]=arr1[i];
        }
        arr2[0]=900;
        for (int i = 0; i < arr1.length ; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("===================");
        for (int i = 0; i < arr2.length ; i++) {
            System.out.println(arr2[i]);
        }
    }
}
