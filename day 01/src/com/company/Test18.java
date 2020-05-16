package com.company;

import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/4/12 15:45
 */
public class Test18 {
    public static void main(String[] args) {
        System.out.println("请输入小明左手拿的纸牌：");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("请输入小明右手拿的纸牌：");
        Scanner scc = new Scanner(System.in);
        int b=scc.nextInt();
        System.out.println("互换前小明手中的纸牌：");
        System.out.println("小明左手拿的纸牌："+a);
        System.out.println("小明右手拿的纸牌："+b);
        int c = b;
        int d = a;
        System.out.println("互换后小明手中的纸牌：");
        System.out.println("小明左手拿的纸牌："+c);
        System.out.println("小明右手拿的纸牌："+d);
    }

}
