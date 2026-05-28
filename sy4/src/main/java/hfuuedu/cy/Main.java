package hfuuedu.cy;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("方法选择：（1递归、2循环）");
        int choice = sc.nextInt();
        if(choice==1){
            int a = sc.nextInt();
            int b = sc.nextInt();
            tm1 tm = new tm1(a,b);
            tm.func();
        }else if(choice==2){
            int a = sc.nextInt();
            int b = sc.nextInt();
            tm2 tm = new tm2(a,b);
            tm.func();
        }
    }
}