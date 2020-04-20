package com.company;

import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/4/14 10:29
 */
public class JianRuLianXi01 {
    public static void main(String[] args) {

        //提示用户录入他/她的年龄.
        System.out.println("请输入年龄：");

        //通过键盘录入功能, 接收用户录入的年龄.
         Scanner scanner = new Scanner(System.in);
         int age = scanner.nextInt();

        //将用户录入的数据(年龄)打印到控制台上.
         System.out.println(age);
    }
}
