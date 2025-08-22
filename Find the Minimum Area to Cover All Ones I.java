class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int minrow = m, maxrow = -1, mincol = n, maxcol = -1;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[i].length; j++)
            {
                if(grid[i][j]==1)
                {
                    minrow = Math.min(minrow, i);
                    maxrow = Math.max(maxrow, i);
                    mincol = Math.min(mincol, j);
                    maxcol = Math.max(maxcol, j);
                }
            }
        }

        return (maxrow-minrow+1)*(maxcol-mincol+1);
    }
}