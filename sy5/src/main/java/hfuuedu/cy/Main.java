package hfuuedu.cy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择题目（1/2）");
        int choice = sc.nextInt();
        if(choice==1){
            int n = sc.nextInt();
            tm1 tm = new tm1(n);
            tm.print();
        }else if(choice==2){
            String s = sc.next();
            tm2.func(s);
        }

    }
}