class Solution {
    public int maximum69Number (int num) {
        int copy = num;
        int pos = -1;
        int k = 0;
        while(copy!=0)
        {
            if(copy%10==6)
            {
                pos = k;
            }
            copy = copy/10;
            k++;
        }
        int sum = 0;
        k=0;
        while(num!=0)
        {
            if(k==pos)
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