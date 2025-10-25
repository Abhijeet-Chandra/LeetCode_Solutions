class Solution {
    public int totalMoney(int n) {
        int m = (int) Math.ceil((double) n / 7);
        int k = 1;
        int j = 7;
        int sum = 0;
        int counter = n % 7;
        while (m != 0) {
            if (m == 1&&counter!=0) {

                for (int i = k; counter != 0; i++) {
                    sum += i;
                    counter--;
                }
                m--;
            } else {
                for (int i = k; i <= j; i++) {
                    sum += i;
                }
                k++;
                j++;
                m--;
            }
        }
        return sum;
    }
}