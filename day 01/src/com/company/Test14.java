package com.company;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {

//        小明快要期末考试了，小明爸爸对他说，会根据他的考试成绩，送他不同的礼物.
//                假如你可以控制小明的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出。
//        礼物标准如下:
//        90~100 山地自行车一辆
//        80~89 游乐场玩一次
//        70~79 变形金刚玩具一个
//        70以下 胖揍一顿

        System.out.println("请输入小明的考试成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 0 && score <= 100) {
            switch (score / 10) {
                case 10:
                case 9:
                    System.out.println("老爸奖励小明山地自行车一辆");
                    break;
                case 8:
                    System.out.println("老爸领小明去游乐场玩一次");
                    break;
                case 7:
                    System.out.println("老爸奖励小明变形金刚玩具一个");
                    break;
                default:
                    System.out.println("恭喜小明，成功引起老爸注意，被胖揍一顿");
                    break;

            }
        }
         else{
                System.out.println("请输入合法成绩");
            }
        }
}

