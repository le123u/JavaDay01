package com.company;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
//        提示用户录入3个整数, 并接收.
//                通过if语句获取这三个整数的最大值.
//                将结果打印到控制台上.
        System.out.println("请输入第三个整数：");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
//         System.out.println("这三个整数中最大的是："+max(a,b,c));

        if(a > b && a > c){
            System.out.println("最大值为"+a);
        }
        else if (b > c){
            System.out.println("最大值为"+b);
        }
        else{
            System.out.println("最大值为"+c);
        }
        /**
         * Scanner scanner = new Scanner(System.in)
         * System.out.println("请输入第一个整数：");
         * int a = scanner.nextInt();
         * System.out.println("请输入第二个整数：");
         * int b = scanner.nextInt();
         * System.out.println("请输入第三个整数：");
         * int c = scanner.nextInt();
         * 方式一
         * int max = a;
         * if (a > b && a > c){
         *     max = a;
         * }
         * else if(b > a && b > c){
         *     max = b
         * }
         * else{
         *     max = c
         * }
         * System.out.println("最大值是：" + max);
         */

        /**
         * 方式二 用if嵌套
         * int max2 = a;
         * if (a > b){
         *     if (a > c){
         *         max2 = a;
         *     }
         *     else{
         *         max2 = c;
         *     }
         * }
         * else{
         *     if (b > c){
         *         max2 = b;
         *     }
         *     else{
         *         max2 = c;
         *     }
         * }
         * System.out.println("最大值是：" + max2);
         */
    }
}
