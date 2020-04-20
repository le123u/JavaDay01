package com.company;

/**
 * @author Liu
 * @date 2020/4/14 9:50
 */
public class WhileLianXi03 {
    public static void main(String[] args) {
        //已知世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米).
        //假如我有一张足够大的纸，它的厚度是0.1毫米.
        //请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
        //即: 纸张的厚度 >= 珠穆朗玛峰的高度
        double weight = 0.1;
        int hight = 8844430;
        int count = 0;
        while(weight <= hight){
            weight *= 2;
            count++;
        }
        System.out.println("需要折叠"+count+"次");
        }
    }

