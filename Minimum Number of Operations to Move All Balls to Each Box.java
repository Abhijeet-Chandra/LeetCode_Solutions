class Solution {
    public int[] minOperations(String boxes) {
        int [] ans = new int[boxes.length()];
        int cumsum = 0, cumval = 0;
        //left cumsum
        for(int i=0; i<boxes.length(); i++){
            ans[i] = cumval;
            cumsum +=boxes.charAt(i)-'0';
            cumval+=cumsum;
        }
        //right cumsum
        cumsum = 0; cumval = 0;
        for(int i=boxes.length()-1; i>=0; i--){
            ans[i] += cumval;
            cumsum+=boxes.charAt(i)-'0';
            cumval+=cumsum;
        }
        return ans;
    }
}