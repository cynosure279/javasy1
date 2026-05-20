package hfuuedu.cy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("题目选择：（1、2）");
        int choice = sc.nextInt();
        tm1 tm = new tm1();
        tm2 tmm = new tm2();
        if(choice==1){
            System.out.println("2～100以内的所有素数：");
            tm.func();
        }else if(choice==2){
            System.out.println("请输入n：");
            int n = sc.nextInt();
            tmm.func(n);
        }

    }
}