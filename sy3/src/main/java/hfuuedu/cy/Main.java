package hfuuedu.cy;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("题目选择：（1、2）");
        int choice = sc.nextInt();
        tm2 tmm = new tm2();
        if(choice==1){
            int n = sc.nextInt();
            tm1 tm = new tm1(n);
            tm.read();
            tm.func();
        }else if(choice==2){
            tmm.print();
        }
    }
}