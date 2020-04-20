package com.company;

import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/4/14 10:34
 */
public class JianRuLianXi02 {
    public static void main(String[] args) {

        //提示用户录入第一个和尚的身高, 并接收
        System.out.println("请输入第一个和尚的身高：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        //提示用户录入第二个和尚的身高, 并接收
        System.out.println("请输入第一个和尚的身高：");
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();

        //提示用户录入第三个和尚的身高, 并接收.
        System.out.println("请输入第一个和尚的身高：");
        Scanner scanner2 = new Scanner(System.in);
        int c = scanner2.nextInt();

        //通过三元运算符, 获取三个和尚中身高最矮的那个和尚的身高.
        int i = a > b ? a : b;
        int max = i > c ? i : c;

        //将结果(最低身高)打印到控制台上.
        System.out.println(max);

    }
}
