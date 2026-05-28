package hfuuedu.cy;

public class tm1 {
    int ans;
    public static int calc(int a,int b){
        if(b == 0) return a;
        return calc(b,a%b);
    }
    public tm1(int a,int b){
        int maxn = Math.max(a, b);
        int minn = Math.min(a, b);
        a = maxn;
        b = minn;
        ans = calc(a,b);
    }
    public void func(){
        System.out.println(ans);
    }
}
