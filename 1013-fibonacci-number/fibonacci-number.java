class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int f0=0,f1=1,fib=0;
        for(int i=2;i<=n;i++){
            fib=f0+f1;
            f0=f1;
            f1=fib;
        }
        return fib;
    }
}