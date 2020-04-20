package com.company;

/**
 * @author Liu
 * @date 2020/4/14 9:30
 */
public class ForLianXi08 {
    public static void main(String[] args) {
        //把1~100之间的数字, 按照6个一行的格式进行输出
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+"\t");
            count += 1;
            if (count % 6 == 0) {
                System.out.println();

            }
        }

    }
}


