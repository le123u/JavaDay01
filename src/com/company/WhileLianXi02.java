package com.company;

/**
 * @author Liu
 * @date 2020/4/14 9:46
 */
public class WhileLianXi02 {
    public static void main(String[] args) {
        //获取1~100之间所有偶数和, 并将结果打印到控制台上
        int i = 1;
        int sum = 0;
        while(i <= 100){
            if(i % 2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
