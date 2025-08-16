class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        int i=0;
        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='6')
            {
                break;
            }
        }
        int k=0;
        int sum = 0;
        while(num!=0)
        {
            if(k==s.length()-1-i)
            {
                sum+=9*Math.pow(10,k);
            }
            else{
                sum+=(num%10)*Math.pow(10,k);
            }
            num = num/10;
            k++;
        }
        return sum;
    }
}