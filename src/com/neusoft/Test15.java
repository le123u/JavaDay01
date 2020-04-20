package com.neusoft;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        System.out.println("请输入工龄：");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("请输入基本工资：");
        Scanner scc = new Scanner(System.in);
        int money = scc.nextInt();
        int add_money;
        int money_money;
        if(age >= 0 && age < 15){
            switch(age){
                case 14:
                case 13:
                case 12:
                case 11:
                case 10:
                    add_money = 5000;
                    money_money = money + add_money;
                    System.out.println("您目前工作了"+age+"年，基本工资为"+money+"元，应涨工资"+add_money+"元，" +
                            "涨后工资"+money_money+"元");
                    break;
                case 9:
                case 8:
                case 7:
                case 6:
                case 5:
                    add_money = 2500;
                    money_money = money + add_money;
                    System.out.println("您目前工作了"+age+"年，基本工资为"+money+"元，应涨工资"+add_money+"元，" +
                            "涨后工资"+money_money+"元");
                    break;
                case 4:
                case 3:
                    add_money = 1000;
                    money_money = money + add_money;
                    System.out.println("您目前工作了"+age+"年，基本工资为"+money+"元，应涨工资"+add_money+"元，" +
                            "涨后工资"+money_money+"元");
                    break;
                case 2:
                case 1:
                    add_money = 500;
                    money_money = money + add_money;
                    System.out.println("您目前工作了"+age+"年，基本工资为"+money+"元，应涨工资"+add_money+"元，" +
                            "涨后工资"+money_money+"元");
                    break;
                default:
                    add_money = 200;
                    money_money = money + add_money;
                    System.out.println("您目前工作了"+age+"年，基本工资为"+money+"元，应涨工资"+add_money+"元，" +
                            "涨后工资"+money_money+"元");
                    break;
            }
        }
        else{
            System.out.println("请输入合法工龄");
        }
    }
}
