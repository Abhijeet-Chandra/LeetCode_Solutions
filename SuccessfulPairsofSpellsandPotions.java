class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int [] ans = new int[spells.length];
        for(int i=0; i<spells.length; i++){
            ans[i] = isSuccessful(spells[i],potions,success);
        }
        return ans;
    }
    public int isSuccessful(int spells, int [] potions, long success){
        int low = 0;
        int high = potions.length-1;
        int count = 0;
        int index = potions.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if((long)spells*potions[mid]<success){
                low = mid+1;
            }
            else{
                index = mid;
                high = mid-1;
                
            }
        }
        return potions.length-index;
    }
}