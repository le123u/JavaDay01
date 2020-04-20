package com.neusoft;

import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/4/12 15:38
 */
public class Test17 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位整数：");
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        if (s >= 100 || s < 100) {
            int a1 = s / 100;
            int b1 = (s % 100) / 10;
            int c1 = s % 10;
            int s1 = (a1 * a1 * a1) + (b1 * b1 * b1) + (c1 * c1 * c1);
            if (s == s1) {
                System.out.println("" + s + "是水仙花数");
            } else {
                System.out.println("" + s + "不是水仙花数");
            }
        }else{
            System.out.println("请输入一个三位整数");
        }


        //三目运算符/三元表达式
        //（关系表达式） ？ 表达式1 ： 表达式2；
        // 先执行关系表达式 ，看其结果是true还是false
        // 如果是 true 执行表达式1， 如果是false执行表达式2

        //改写水仙花数
        // boolean flag = (s == s1) ? true : false;

        /**
         * boolean flag = false;
         *     if(s == s1){
         *         flag = true;
         *     }else{
         *         flage = false;
         *     }
         *     System.out.println(num + '是水仙花数' + flag)
         *
         */
    }
}
