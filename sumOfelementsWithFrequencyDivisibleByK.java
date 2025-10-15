class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            max = Math.max(max,nums[i]);
        }
        int [] freq = new int[max+1];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(freq[nums[i]]%k==0){
                sum+=nums[i];
            }
        }
        return sum;
    }
}