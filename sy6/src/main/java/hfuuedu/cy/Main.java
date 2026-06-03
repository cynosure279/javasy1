package hfuuedu.cy;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("题目选择：（1、2）");
        int choice = sc.nextInt();
        if(choice==1){
            tm1.func();
        }else if(choice==2){
            tm2.func();
        }
    }
}