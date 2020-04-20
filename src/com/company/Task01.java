package com.company;

/**
 * @author Liu
 * @date 2020/4/14 10:50
 */
public class Task01 {
    public static void main(String[] args) {
        //按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数.
        //每行输出5个满足条件的数，之间用空格分隔
        //如：9999 9988 9977 9966 9955
        int count = 0;
        for (int i = 9999 ; i >= 1000;i--){
            int ge = i % 10;
            int shi = (i % 100) / 10;
            int bai = (i % 100) / 100;
            int qian = i / 1000;
            if (ge + bai == shi + qian ){
                count += 1;
                if (count <= 5){
                    System.out.print(i +" ");
                }

            }
        }
    }
}
