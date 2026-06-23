class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        Map<Integer,List<Integer>> diagonals = new HashMap<>();
        for(int i =0;i<row;i++){
            for(int j=0; j<col;j++){
                 diagonals.computeIfAbsent(i - j, k -> new ArrayList<>())
                         .add(mat[i][j]);
            }
        }
        // Sort each diagonal once
        for (List<Integer> diagonal : diagonals.values()) {
            Collections.sort(diagonal);
        }

        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int key = i - j;
                int idx = index.getOrDefault(key, 0);
                mat[i][j] = diagonals.get(key).get(idx);
                index.put(key, idx + 1);
            }
        }

        return mat;

    }
}