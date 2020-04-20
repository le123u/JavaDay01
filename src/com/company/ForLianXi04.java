package com.company;

/**
 * @author Liu
 * @date 2020/4/14 9:08
 */
public class ForLianXi04 {
    public static void main(String[] args) {
        //求1-100之间的偶数和，并把求和结果打印到控制台上
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
