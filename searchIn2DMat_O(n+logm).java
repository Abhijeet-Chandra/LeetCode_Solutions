class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[0].length - 1]) {
                int low = 0;
                int high = matrix[0].length - 1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (target > matrix[i][mid]) {
                        low = mid + 1;
                    } else if (target < matrix[i][mid]) {
                        high = mid - 1;
                    } else {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}