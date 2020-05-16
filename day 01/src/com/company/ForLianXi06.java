package com.company;

/**
 * @author Liu
 * @date 2020/4/14 9:18
 */
public class ForLianXi06 {
    public static void main(String[] args) {
        //统计所有水仙花数的个数, 并将其打印到控制台上
        int ge,shi,bai;
        int count = 0;
        for(int i = 100;i < 1000; i++){
            ge = i % 10;
            shi = i % 100 / 10;
            bai = i /100;
            if (i == ge*ge*ge +shi*shi*shi + bai*bai*bai){
                count += 1;
                System.out.println(i);
            }
        }
        System.out.println("水仙花的个数为"+count+"");
    }
}
