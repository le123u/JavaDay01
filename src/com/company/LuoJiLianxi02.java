package com.company;

/**
 * @author Liu
 * @date 2020/4/14 10:11
 */
public class LuoJiLianxi02 {
    public static void main(String[] args) {
        //1. 定义两个int类型的变量a和b, 初始化值分别为: 2, 5
        int a = 2, b = 5;
        //2. 演示逻辑与(&)
       /* System.out.println((a++ > 2) & (b++ < 7)); //两个表达式都会执行.
        System.out.println(a);
        System.out.println(b);*/
        System.out.println("------------------");

        //3. 演示短路与(&&)
        System.out.println((a++ > 2) && (b++ < 7)); //左边表达式结果为false, 右边不执行.
        System.out.println(a);
        System.out.println(b);
    }
}
