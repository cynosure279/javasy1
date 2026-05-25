package hfuuedu.cy;

import java.util.Scanner;

import static java.lang.Math.abs;

public class tm1 {
    int n;
    int[] data;
    public tm1(int _n){
        n = _n;
        data = new int[n];
    }
    public void read(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            data[i] = sc.nextInt();
        }
    }
    public void func(){
        int maxn=0,minn=0x3f3f3f3f,maxidx = 0,minidx=0;
        for(int i = 0;i<n;i++){
            if(data[i]>maxn ){
                maxn=data[i];
                maxidx=i;
            }
            if(data[i]<minn){
                minn=data[i];
                minidx=i;
            }
        }
        System.out.println(abs(maxidx-minidx));
    }
}
