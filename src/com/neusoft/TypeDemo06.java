package com.neusoft;

public class TypeDemo06 {
    public static void main(String[] orgs){
        // 数据类型转换
        //如果数据类型不一致需要进行数据类型转换

        //1.自动类型转换（隐式转换）：小的类型自动提升成大的类型
        //将取值范围小的类型自动提升为取值范围大的类型

        // 定义两个int类型的变量a和b, 分别赋值为10, 20.
        int a = 10;
        int b = 20;
        // 通过输出语句打印变量a和b的和.
        System.out.println(a);
        System.out.println(b);
        //  定义int类型的变量c, 接收变量a和b的和.
        int c = a + b;
        // 打印变量c的值.
        System.out.println(c);
        // 定义两个变量aa和bb, 一个是int类型的数据, 另一个是byte类型的数据.
        int aa = 30;
        byte bb = 40;
        // 定义变量cc接收 变量aa和bb的和.
        int cc = aa + bb;
        // byte cc = aa + bb; 大的不能转换成小的
        // 分别设置变量cc的数据类型为byte类型和int类型, 观察结果并打印.
        System.out.println(cc);
        System.out.println("*************");

        //2.强制类型转换（显示转换）：大类型转换成小类型
        double d = 30.5;
        // 格式： 数字类型 变量名 = （强制转换的类型） 要被转换的数值
        int dd = (int) d;
        System.out.println(dd);




    }
}
