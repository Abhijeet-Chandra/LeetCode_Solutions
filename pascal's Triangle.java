class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> sublist = new LinkedList<>();
            for (int j = 0; j <= i; j++) {
                sublist.add(nCr(i, j));
            }
            list.add(sublist);
        }
        return list;
    }

    public static int nCr(int n, int r) {
        if(r>n)return 0;
        if(r>n-r) r = n-r;
        int res = 1;
        for(int i=0; i<r; i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
}