class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int num=1;
       int low=0,high=n-1;
       while(low<high){
        ans[low]=num;
        ans[high]=-num;
        num++;
        low++;
        high--;
       }
       return ans;
    }
}