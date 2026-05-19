package hfuuedu.cy;

import java.util.ArrayList;
import java.util.List;

public class tm2 {

    private int limit;
    private List<Integer>[] factors;
    public tm2(int limit){
        this.limit = limit;
        this.factors = new ArrayList[limit + 1];
        for (int i = 0; i <= limit; i++) {
            factors[i] = new ArrayList<>();
        }
        sieveFactors();
    }
    public tm2(){
        this(100000);
    }
    private void sieveFactors() {
        for (int i = 1; i <= limit; i++) {
            for (int j = i; j <= limit; j += i) {
                factors[j].add(i);
            }
        }
    }
    public void func(int a, int b){
        int cnt1 = 0,cnt2 = 0,cnt3 = 0;
        for(int i = a;i<=b;i++){
            int sum = 0;
            List<Integer> factor = factors[i];
            for(int j = 0;j<factor.size();j++) {
                sum += factor.get(j);
            }
            if(sum>2*i){
//              System.out.println("");
                cnt1++;
            }
            else if(sum==2*i){
                cnt2++;
            }
            else if(sum<2*i){
                cnt3++;
            }

        }
        System.out.println("Abundant:"+cnt1);
        System.out.println("Perfect:"+cnt2);
        System.out.println("Deficient:"+cnt3);
    }
    public List<Integer>[] getFactors() {
        return this.factors;
    }
}