package hfuuedu.cy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tm2 {

    private int limit;
    private boolean[] isPrime;
    private List<Integer> primes;

    public tm2(int limit){
        this.limit = limit;
        this.isPrime = new boolean[limit + 1];
        this.primes = new ArrayList<>();
        Arrays.fill(isPrime, true);
        if (limit >= 0) isPrime[0] = false;
        if (limit >= 1) isPrime[1] = false;

        sievePrimes();
    }

    public tm2(){
        this(100000);
    }
    private void sievePrimes() {
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
                for (long j = (long) i * i; j <= limit; j += i) {
                    isPrime[(int) j] = false;
                }
            }
        }
    }

    public void func(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if (isPrime[i]) {
                list.add(i);
            }else{
                Boolean flag = false;
                for(int j = 0;j<primes.size();j++){
                    int v = primes.get(j);
                    if(v>=i) break;
                    int other = i/v;
                    if(other*v!=i) continue;
                    if(isPrime[other]){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    list.add(i);
                }
            }
        }
        for(int i : list){
            System.out.println(i);
        }
    }
    public List<Integer> getPrimes() {
        return this.primes;
    }
    public boolean isPrimeNum(int x) {
        if (x < 0 || x > limit) return false;
        return isPrime[x];
    }
}