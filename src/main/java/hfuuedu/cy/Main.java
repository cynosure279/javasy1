package hfuuedu.cy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("题目选择：（1、2）");
            int choice = sc.nextInt();
            tm2 tm = new tm2();
            if(choice==1){
                System.out.println("请输入月份：");
                int mth = sc.nextInt();
                tm1.func(mth);
            }else if(choice==2){
                while(true) {
                    System.out.println("请输入区间范围：");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    if(a>b){
                        break;
                    }
                    tm.func(a, b);
                }
            }

    }
}