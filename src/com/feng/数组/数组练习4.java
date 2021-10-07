package com.feng.数组;

public class 数组练习4 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int sum=0;
        int index=-1;
        int max=0;
        int maxIndex=0;
        boolean flag = false;
        for (int i = 0; i <10 ; i++) {
            arr[i] =(int)(Math.random()*100)+1;
            sum+=arr[i];
        }
        System.out.println("=======倒序=========");
        for (int i = arr.length-1; i>=0;i--) {
            System.out.print(arr[i]+" ");
        }
        max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (max<arr[i]){
                max=arr[i];
                maxIndex=i;
            }
        }
        System.out.println("最大值为"+max+"下标为"+maxIndex);

        //平均数
        System.out.println("平均数");
        System.out.println(sum/ arr.length);


        //有没有8
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==8){
                index=i;
                flag=true;
            }
        }
        if (flag){
            System.out.println("有8，坐标为"+index);
        }else {
            System.out.println("没8");
        }
    }
}
