package com.neusoft;

import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/4/12 15:17
 */
public class Test16 {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数：");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("请输入第二个整数：");
        Scanner scc = new Scanner(System.in);
        int b=scc.nextInt();
        System.out.println("请输入您要进行的计算（0：表示加法运算，1:表示减法运算，2：表示乘法运算，3：表示除法运算）");
        Scanner sccc = new Scanner(System.in);
        int c=sccc.nextInt();
        if (c == 0){
            System.out.println("a + b ="+(a+b));
        }else if(c == 1){
            System.out.println("a - b ="+(a-b));
        }else if(c == 2){
            System.out.println("a * b ="+(a*b));
        }else if(c == 3){
            System.out.println("a / b ="+(a/b));
        }else{
            System.out.println("请输入正确的值");
        }

    }
}
