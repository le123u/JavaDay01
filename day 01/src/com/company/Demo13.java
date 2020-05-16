package com.company;

public class Demo13 {
    public static void main(String[] args) {

        //switch 语句：一般用于做固定值判断
        /**
         * 格式
         * switch(表达式){
         *     case 值1：
         *          语句体；
         *      case 值2：
         *          语句体；
         *     .....
         *       default:
         *          语句体;
         *          break;
         * }
         */

        //case 穿透 如果case中不写break将出现case穿透现象
        //也就是说 不会在判断下一个case值，直接向后运行，直到遇到break，或者switch语句结束

        //三目运算符
        //（关系表达式） ？ 表达式1 ： 表达式2；
        // 先执行关系表达式 ，看其结果是true还是false
        // 如果是 true 执行表达式1， 如果是false执行表达式2

        //改写水仙花数
        // boolean flag = (s == s1) ? true : false;

    }
}
