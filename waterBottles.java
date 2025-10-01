class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int full = numBottles;
        int empty = 0;
        int totalBottles = full;
        while(full + empty >= numExchange){
            empty = full+empty;
            full= empty/numExchange;
            empty = empty%numExchange;
            totalBottles+=full;
        }
        return totalBottles;
    }
}