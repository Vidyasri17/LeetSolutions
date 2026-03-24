class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int size = m * n;
        int[] arr = new int[size];
        int inx = 0;
        for(int[] a: grid){
            for(int i: a) arr[inx++] = i % 12345;
        }
        int[] prefix = new int[size];
        int[] suffix = new int[size];
        prefix[0] = 1;
        for(int i = 1; i < size; i++){
            prefix[i] = (prefix[i - 1] * arr[i - 1]) % 12345;
        }
        suffix[size - 1] = 1;
        for(int i = size - 2; i >= 0; i--){
            suffix[i] = (suffix[i + 1] * arr[i + 1]) % 12345;
        }
        int[][] p = new int[n][m];
         inx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                p[i][j] = (prefix[inx] * suffix[inx]) % 12345;
                inx++;
            }
        }
        return p;
    }
}