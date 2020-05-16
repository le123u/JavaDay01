package com.company;

public class VariableDemo04 {
    public static void main(String[] orgs){
        /**
         * int a;
         * System.out.println(a);
         * 变量未赋值，不能使用
         */

        {
            //大括号{}包裹起来的代码叫做代码块
            //代码块作用：让变量尽可能早的从内存消失，从而节约资源，提高效率
            //高级编程语言 带有GC垃圾回收机制
            double d = 22.22;
            System.out.println(d);
        }
        // 此行代码会报错 变量d从内存中已经消失 无法访问
        //System.out.println(d);

        //变量可以一行声明多个
        int e = 10 , f = 20 , g = 50;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        //python中声明多个变量
        //主攻Java(80%) 辅修javascript和python(20%)
        //a , b , c = 10 , 20 , 30
    }
}
