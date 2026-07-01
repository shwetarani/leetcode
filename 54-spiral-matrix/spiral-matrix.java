class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;
        while (top <= bottom && left <= right) { 
            
            // go to right
            for(int i =left;i<=right;i++) {
                result.add(matrix[left][i]);
            }
            top++;
            // go to bottom
            for(int i =top;i<=bottom;i++) {
                result.add(matrix[i][right]);
            }
            right--;
            //go to left 
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            //go to up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
        
    }
}