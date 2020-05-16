package com.company;

import java.util.Scanner;

public class  Demo09 {
    public static void main(String[] args) {
        //条件控制
        //流程控制
        //1.顺序结构 代码一行一行执行

        //2.选择结构 if   switch

        // 单分支
        /**
         * if (判断条件){
         *    满足条件要执行的事情
         *   }
         */

        //定义一个时间变量time
        int time = 11;
        if (time >= 11 && time <= 13){
            System.out.println("已经中午了，要准备休息了！");
        }
        System.out.println("*******");

        //双分支
        /**
         * if (判断条件){
         *     满足条件要执行的事情
         * }
         * else{
         *     不满足条件要执行的事情
         * }
         */

        //定义一个时间变量time1
        int time1 = 10;
        if (time1 >= 11 && time1 <= 13){
            System.out.println("已经中午了，要准备休息了！");
        }
        else{
            System.out.println("还不是中午，不可以休息");
        }
        System.out.println("*******");

        // 用户在键盘输入一个整数并接收
        //创建一个扫描器 创建一个对象
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        //在控制台中接收参数
        int num = sc.nextInt();
        System.out.println("您输入的整数为：" +num);
        // 判断这个数是奇数还是偶数 并打印
        if (num % 2 == 0){
            System.out.println(num+"是偶数");
        }
        else{
            System.out.println(num+"是奇数");
        }
        System.out.println("*******");

        //臃肿 if只有一行可以不写{}
        if(true)
            System.out.println("Hello");
        System.out.println("*******");

        //多分支
        /**
         * if（条件1）{
         *
         * }
         * elif(条件2){
         *
         * }
         * else{
         *
         * }
         */

        //3.循环结构  for  while  do while

        //for循环
        /**
         * for (初始化条件1；判断条件2；控制条件3){
         *     循环体4
         * }
         */
        /**
         * for(int i =0;i < 10;i++){
         *     System.out.println("我们不一样")；
         * }
         */

        //求出所有水仙花数
        int ge,shi,bai,count = 0;
        for(int i = 100;i < 1000;i++){
            ge = i % 10;
            shi = i / 10 % 10;
            bai = i / 100 ;
            if (i == ge*ge*ge + shi*shi*shi + bai*bai*bai){
                System.out.println(i );
                count++;
            }
        }
        System.out.println("水仙花数共有“+count+”个");

        //while循环
        /**
         * while (循环条件){
         *     循环体:
         * }
         */

        int i = 0;
        while(i < 10){
            System.out.println("啥时候开学");
            i++;
        }

        //do while 循环
        int a = 1;
        do{
            System.out.println("啥时候开学");
            i++;
        }while(i <= 10);

        //死循环

        /**
         * for(;;){
         *      System.out.println("啥时候开学");
         * }
         */

        /**
         * while(true){
         *      System.out.println("啥时候开学");
         * }
         */

        /**
         * do{
         *      System.out.println("啥时候开学");
         * }while(true);
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("daad");
    }
}
