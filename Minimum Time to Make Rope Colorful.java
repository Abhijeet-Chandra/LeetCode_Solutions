class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i = 1, sum = neededTime[0], max = neededTime[0], ans = 0;
        while(i<neededTime.length){
            if(colors.charAt(i-1)==colors.charAt(i)){
                max = Math.max(neededTime[i],max);
                sum+=neededTime[i];
            }
            else{
                ans+=sum-max;
                max = neededTime[i];
                sum = neededTime[i];
            }
            i++;
        }
        ans+=sum-max;
        return ans;
    }
}