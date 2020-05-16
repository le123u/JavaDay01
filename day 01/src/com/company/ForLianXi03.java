package com.company;

/**
 * @author Liu
 * @date 2020/4/14 9:03
 */
public class ForLianXi03 {
    public static void main(String[] args) {
        // 通过for循环, 获取1 ~ 5之间的数字之和.
        int sum = 0;
        for ( int i = 1; i <= 5; i++){
            sum = sum+ i;
        }
        System.out.println(sum);
    }
}
