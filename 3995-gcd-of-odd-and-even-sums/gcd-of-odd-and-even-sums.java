class Solution {
    public int gcdOfOddEvenSums(int n) {
        int osum=0,esum=0,max=1;
        for(int i=1;i<=n+n;i++){
             if(i%2==0){
                esum+=i;
             }
             else{
                osum+=i;
             }
        }
             int m=Math.min(esum,osum);

             for(int i=1;i<=m;i++){
                if(esum%i==0 && osum%i==0 ){
                    max=i;
                }
             }
        
        return max;
    }
}