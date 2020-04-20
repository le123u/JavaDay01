package com.company;

/**
 * @author Liu
 * @date 2020/4/14 10:14
 */
public class LuoJiLianxi03 {
    public static void main(String[] args) {
        //定义两个int类型的变量a. b, 初始化值分别为10, 20
        //通过三元运算符, 获取变量a和b的最大值.
        //将结果(最大值)打印到控制台上.
        //(关系表达式) ? 表达式1：表达式2；
        int a = 10;
        int b = 20;
        int max = a < b ? b : a;
        System.out.println(max);
    }
}
