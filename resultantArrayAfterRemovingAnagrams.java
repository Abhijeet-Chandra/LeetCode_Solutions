class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new LinkedList<>();
        int i=0, j =1;
        while(i<words.length&&j<words.length){
            if(areAnagrams(words[i],words[j])){
                j++;
            }
            else{
                list.add(words[i]);
                i=j;
                j++;
            }
        }
        if(i<words.length)list.add(words[i]);
        return list;
    }
    public boolean areAnagrams(String s1, String s2){
        if(s1.length()!=s2.length())return false;
        int [] freq = new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(freq[i]!=0)return false;
        }
        return true;
    }
}