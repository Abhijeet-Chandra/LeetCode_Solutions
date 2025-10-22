class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles = 0;
        int bottlesDrunk = 0;
        while(numBottles+emptyBottles>=numExchange){
            emptyBottles = numBottles+emptyBottles;
            bottlesDrunk += numBottles;
            numBottles = 0;
            while(numExchange<=emptyBottles){
                emptyBottles = emptyBottles - numExchange;
                numBottles++;
                numExchange++;
            }
        }
        bottlesDrunk+=numBottles;
        return bottlesDrunk;
    }
}