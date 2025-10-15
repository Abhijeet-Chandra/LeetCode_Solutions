class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int currL = 1;
        int prevL = 0;
        int k  = 0;
        for(int i=1; i<nums.size(); i++){
            if(nums.get(i)>nums.get(i-1)){
                currL++;
            }
            else{
                prevL = currL;
                currL = 1;
            }
            k = Math.max(Math.min(currL,prevL),k);
            k = Math.max(k,currL/2);
        }
        return k;
    }
}