package com.feng.数组;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr={4,-1,78,-5,9,10,23};
        int max=arr[0];
        int index=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
