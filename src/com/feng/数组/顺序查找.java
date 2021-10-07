package com.feng.数组;

import java.util.Scanner;

public class 顺序查找 {
    public static void main(String[] args) {
        String[] arr={"a","b","c","d"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字");
        String findKey = scanner.next();
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (findKey.equals(arr[i])){
                System.out.println("找到了"+arr[i]+"下标为"+i);
                index=i;
                break;
            }
        }
        if (index==-1){
            System.out.println("没找到");
        }
    }
}
