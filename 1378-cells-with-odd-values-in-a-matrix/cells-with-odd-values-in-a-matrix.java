class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for(int[] index: indices){
            int row = index[0];
            int col = index[1];
            for(int i = 0; i < n; i++) matrix[row][i]++;
            for(int i = 0; i < m; i++) matrix[i][col]++;
        }
        int ans = 0;
        for(int[] row: matrix){
            for(int i: row){
                if(i % 2 == 1) ans++;
            }
        }
        return ans;
    }
}