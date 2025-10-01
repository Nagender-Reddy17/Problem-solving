class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int dk=numBottles,em=numBottles;
        while(em>=numExchange)
        {
            int n=em/numExchange;
            dk+=n;
            em = (em % numExchange) + n;
        }
        return dk;
    }
}