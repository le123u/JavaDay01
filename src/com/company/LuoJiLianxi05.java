package com.company;

/**
 * @author Liu
 * @date 2020/4/14 10:24
 */
public class LuoJiLianxi05 {
    public static void main(String[] args) {
        //一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm
        //请用程序实现获取这三个和尚的最高身高
        int a = 150;
        int b = 210;
        int c = 165;

        int i = a > b ? a : b;
        int max = i > c ? i : c;
        System.out.println(max);

    }
}
