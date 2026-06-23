class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
         int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1; // current number to fill

        while (num <= n *n) {
            //left
            for (int i= left ; i<=right; i++) {
                result[top][i] = num++;
            }
            top++;
            // down
            for (int i = top;i<=bottom;i++) {
                result[i][right] = num++;
            }
            right--;
            // right
            for (int i = right;i>=left;i--) {
                result[bottom][i] = num++;
            }
            bottom--;
            //up
             for (int i = bottom;i>=top;i--) {
                result[i][left] = num++;
            }
            left++;
        }
        return result;
    }
}