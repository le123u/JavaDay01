package com.company;

/**
 * @author Liu
 * @date 2020/4/14 9:25
 */
public class ForLianXi07 {
    public static void main(String[] args) {
        //获取1 - 100之间的奇数和, 以及奇数的个数
        int sum = 0;
        int count = 0;
        for(int i = 1;i <= 100;i++){
            if (i % 2 == 1){
                sum += i;
                count += 1;
            }
        }
        System.out.println("1 - 100之间的奇数和:"+ sum);
        System.out.println("奇数的个数:"+count);
    }
}
