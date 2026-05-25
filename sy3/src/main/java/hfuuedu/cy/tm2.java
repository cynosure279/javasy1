package hfuuedu.cy;

public class tm2 {
    int n;
    int[] data;
    public void calc(int n){
        data[0]=1;
        data[1]=1;

        for(int i=2;i<n;i++){
            data[i]=data[i-1]+data[i-2];
        }
    }
    public tm2(int n){
        this.n=n;
        data = new int[n];
        calc(n);
    }
    public tm2(){
        this(20);
    }
    public void print(int n){
        for(int i=0;i<n;i++){
            System.out.println(data[i]);
        }
    }
    public void print(){
        print(n);
    }
}
