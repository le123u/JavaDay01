package com.company;

/**
 * @author Liu
 * @date 2020/4/14 10:09
 */
public class LuoJiLianxi01 {
    public static void main(String[] args) {
        //定义三个int类型的变量a, b, c, 它们的初始化值分别为10, 20, 30.
        //通过上述的三个变量, 演示各个逻辑运算符.

        int a = 10, b = 20, c = 30;
        //&: 逻辑与, 并且的意思, 有false则整体为false.
        //相当于: 班长找女朋友, 要求长得漂亮, 并且身材好.
        System.out.println((a > b) & (a > c)); //false & false
        System.out.println((a < b) & (a > c)); //true & false
        System.out.println((a > b) & (a < c)); //false & true
        System.out.println((a < b) & (a < c)); //true & true
        System.out.println("-----------------");

        //|: 逻辑或, 或者的意思, 有true则整体为true.
        //相当于: 降低条件了, 要么长得漂亮, 要么身材好.
        System.out.println((a > b) | (a > c)); //false | false
        System.out.println((a < b) | (a > c)); //true | false
        System.out.println((a > b) | (a < c)); //false | true
        System.out.println((a < b) | (a < c)); //true | true
        System.out.println("-----------------");

        //!: 逻辑非, 取反的意思
        //相当于: 只要不是男的就行.
        System.out.println(!(a > b));   //!false
        System.out.println(!(a < b));   //!true
        System.out.println("-----------------");

        //逻辑异或, 异同的意思, 相同为false, 不同为true.
        //相当于: 最后还是找了个男的, 但是领不了证.
        //法律规定: 一夫一妻, 一男一女, 必须是异性才能领证.
        System.out.println((a > b) ^ (a > c)); //false ^ false
        System.out.println((a < b) ^ (a > c)); //true ^ false
        System.out.println((a > b) ^ (a < c)); //false ^ true
        System.out.println((a < b) ^ (a < c)); //true ^ true



    }
}
