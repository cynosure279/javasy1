package hfuuedu.cy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tm1 {

    private int limit;
    private boolean[] isPrime;
    private List<Integer> primes;

    public tm1(int limit){
        this.limit = limit;
        this.isPrime = new boolean[limit + 1];
        this.primes = new ArrayList<>();
        Arrays.fill(isPrime, true);
        if (limit >= 0) isPrime[0] = false;
        if (limit >= 1) isPrime[1] = false;

        sievePrimes();
    }

    public tm1(){
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
        for(int i = 2; i <= n; i++){
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
    public void func(){
        func(100);
    }
    public List<Integer> getPrimes() {
        return this.primes;
    }
    public boolean isPrimeNum(int x) {
        if (x < 0 || x > limit) return false;
        return isPrime[x];
    }
}