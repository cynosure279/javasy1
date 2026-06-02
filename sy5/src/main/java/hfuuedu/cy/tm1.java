package hfuuedu.cy;

public class tm1
{
    static String[] map ;
    static String[] danwei ;
    static{
        map= new String[]{"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        danwei= new String[]{"佰", "拾", "万", "仟", "佰", "拾", "元"};
    }
    String ans;
    int[] data;
    public tm1(int n){
        data = new int[7];
        ans = "";
//        int [] tmp = new int[7];
        int cnt = 6;
        while(n>0){
            data[cnt--]=n%10;
            n/=10;
        }
//        for(int v : tmp){
//            System.out.print(v+" ");
//        }
//        int idx = 0;
//        while(tmp[idx]==0){
//            idx++;
//        }
//        System.out.println(idx);
//        for(int i = 0;i<7;i++){
//            data[i]=tmp[idx++];
//            if(idx==7) break;
//        }
//        for(int v : data){
//            System.out.print(v+" ");
//        }
        for(int i = 0;i<7;i++){
            ans += map[data[i]]+danwei[i];
        }
    }
    public void print(){
        System.out.println(ans);
    }
}
