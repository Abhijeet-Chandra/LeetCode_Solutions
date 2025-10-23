class Solution {
    public boolean hasSameDigits(String s) {
        boolean ans = true;
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(s);
        do{
            ans = true;
            sb.setLength(0);
            for(int i=0; i<sb2.length()-1; i++){
                sb.append(((sb2.charAt(i)-'0')+(sb2.charAt(i+1)-'0'))%10);
            }
            char key = sb.charAt(0);
            for(int i=0; i<sb.length(); i++){
                if(sb.charAt(i)!=key){
                    ans = false;
                    break;
                }
            }
            if(ans) return ans;
            sb2.setLength(0);
            sb2.append(sb);
        }while(sb.length()>2);
        return false;
    }
}