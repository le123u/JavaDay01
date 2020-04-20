package com.company;

import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/4/14 10:50
 */
public class Task02 {
    public static void main(String[] args) {
        //从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和, 要求如下:
        //数字的个位数不为7;
        //数字的十位数不为5;
        //数字的百位数不为3;
        System.out.println("请输入一个大于100的三位数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


            for (int i = 100; i <= n ; i++){
                int ge = i % 10;
                int shi = (i % 100) / 10;
                int bai = i / 100;
                if (ge != 7 && shi != 5 && bai != 3){
                    System.out.println(i);
                }

            }
    }
}
