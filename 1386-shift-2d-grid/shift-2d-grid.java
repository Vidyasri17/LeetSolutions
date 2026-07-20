class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k %= total;
        int[][] res = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int index = i * n + j;
                int newInx = (index + k) % total;
                int newRow = newInx / n;
                int newCol = newInx % n;
                res[newRow][newCol] = grid[i][j];
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int[] row: res){
            List<Integer> list = new ArrayList<>();
            for(int i: row) list.add(i);
            ans.add(list);
        }
        return ans;
    }
}