class Solution {
    public int firstUniqChar(String s) {
        boolean isUnique = true;
        int pos = -1;
        for(int i=0; i<s.length(); i++){
            isUnique = true;
            char key = s.charAt(i);
            for(int j=0; j<s.length(); j++){
                if(i!=j&&s.charAt(j)==key){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                    pos = i;
                    break;
                }
        }
        return pos;
    }
}