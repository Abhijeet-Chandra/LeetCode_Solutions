class Solution {
    public long calculateScore(String s) {
        HashMap<Character, Stack<Integer>> map = new HashMap<>();
        String str = "abcdefghijklmnopqrstuvwxyz";
        long ans = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, new Stack<>());
        }
        for(int i=0; i<s.length(); i++){
            int mirrorIdx = 'z'-s.charAt(i);
            char mirrorChar = str.charAt(mirrorIdx);
            if(map.get(mirrorChar).size()>0){
                int prevIdx = map.get(mirrorChar).pop();
                ans+=(i-prevIdx);
            }
            else{
                map.get(s.charAt(i)).push(i);
            }   
        }
        return ans;
    }
}