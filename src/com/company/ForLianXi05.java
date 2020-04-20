package com.company;

/**
 * @author Liu
 * @date 2020/4/14 9:12
 */
public class ForLianXi05 {
    public static void main(String[] args) {
        //获取到所有的水仙花数, 并将结果打印到控制台上
        int ge,shi,bai;
        for(int i = 100;i < 1000; i++){
            ge = i % 10;
            shi = i % 100 / 10;
            bai = i /100;
            if (i == ge*ge*ge +shi*shi*shi + bai*bai*bai){
                System.out.println(i);
            }

        }
    }
}
