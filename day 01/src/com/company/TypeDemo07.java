package com.company;

public class TypeDemo07 {
    public static void main(String[] args){
        short s = 22;
        s = (short)(s + 1);
        // s = s + 1 不能运行 s+1为int类型 s为short类型
        // s += 1 能运行 只进行一次操作 并带有强制类型转换 相当于 s = (short)(s + 1)
        System.out.println(s);


        // 自增运算
        int a = 1;
        int b = a++;
        int c = ++a;
        // a++先进行运算/赋值 再进行自增
        // ++a 先进行自增，在进行运算
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
