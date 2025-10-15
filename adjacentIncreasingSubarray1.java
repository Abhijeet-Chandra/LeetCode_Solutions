class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int currL = 1;
        int prevL = 0;
        for(int i=1; i<nums.size(); i++){
            if(nums.get(i-1)<nums.get(i)){
                currL++;
            }
            else{
                prevL = currL;
                currL = 1;
            }
            if(currL>=2*k)return true;
            if(Math.min(currL,prevL)>=k)return true;
        }
        return Math.min(prevL,currL)>=k;
    }
}