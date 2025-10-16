class Solution {
    public int maxDistance(int[] positions, int m) {
        Arrays.sort(positions);
        int max = 0;
        int high = positions[positions.length-1]-positions[0];
        int low  = 1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isValid(positions, mid, m)){
                low = mid+1;
                max = mid;
            }
            else{
                high = mid-1;
            }
        }
        return max;
    }

    public boolean isValid(int[] positions, int i, int m) {
        int j = 0;
        int ans = 1;
        boolean flag = false;
        while (j < positions.length) {
            int search = positions[j] + i;
            flag = false;
            for (int k = j+1; k < positions.length; k++) {
                if (positions[k] >= search) {
                    j = k;
                    flag = true;
                    break;
                }
            }
            if (!flag)
                break;

            ans++;
            if (ans >= m)
                return true;
        }
        return ans >= m;
    }
}