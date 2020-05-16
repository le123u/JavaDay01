package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        // 注释
        // 单行注释
        /**
         * 这是多行注释
         * 在Java中很常用
         */


        //了解常见的关键字，被系统默认为关键字，不用用它起做变量名
        //常见的关键字： public void static class

        //保留字 goto  const(常量)  暂时不是关键字 但以后可能被列入关键字

        // 常量
        // 整数常量 小数常量 字符串常量 布尔常量 空常量 字符常量

        // 变量 variable
        int money = 200;
        System.out.println(money);

        //变量定义的格式
        // 数据类型  变量名 = 变量值；

        // java中的基本数据类型 4类8种
        //整数型：byte(1个字节 = 8位) int（4个字节）  short（2个字节） long（8个字节）
        //浮点型：float（4个字节） double（8个字节）
        //字符型：char（2个字节）
        //布尔型：boolean（1个字节）

        //数据类型定义的格式

        //1.声明变量并且赋值
        //数据类型 变量名 = 初始化值；
        int a = 10;
        System.out.println(a);

        //2.先声明再赋值
        // 数据类型 变量名；
        //变量名 = 初始化值；
        int c;
        c = 100;
        System.out.println(c);
    }
}

