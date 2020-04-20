package com.neusoft;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
//        提示用户录入[1, 7]之间的数字, 并接收.
        System.out.println("请输入一个整数数字：");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println("您输入的整数数字为：" +data);
//        根据用户录入的数字, 打印对应的星期, 格式如下:
//        用户录入1, 打印"星期一"
//        用户录入2, 打印"星期二"
//...以此类推
        if(data == 1){
            System.out.println("今天是星期一");
        }
        else if(data == 2){
            System.out.println("今天是星期二");
        }
        else if(data == 3){
            System.out.println("今天是星期三");
        }
        else if(data == 4){
            System.out.println("今天是星期四");
        }
        else if(data == 5){
            System.out.println("今天是星期五");
        }
        else if(data == 6){
            System.out.println("今天是星期六");
        }
        else if(data == 7){
            System.out.println("今天是星期天");
        }
//        用户录入非法数字, 打印"没有这样的日期"
        else{
            System.out.println("没有这样的日期");
        }
    }
}
