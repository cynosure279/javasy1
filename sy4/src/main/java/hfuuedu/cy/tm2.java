package hfuuedu.cy;

public class tm2 {
    int ans;
    public static int calc(int a,int b){
        while(b!=0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
    public tm2(int a,int b){
        ans = calc(a,b);
    }
    public void func(){
        System.out.println(ans);
    }
}
