class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length==1||nums.length==2)return nums.length;
        int count = 2;
        int maxcount = 2;
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]+nums[i+1]==nums[i+2]){
                count++;
            }
            else{
                maxcount = Math.max(maxcount,count);
                count = 2;
            }
        }
        maxcount = Math.max(maxcount,count);
        return maxcount;
    }
}