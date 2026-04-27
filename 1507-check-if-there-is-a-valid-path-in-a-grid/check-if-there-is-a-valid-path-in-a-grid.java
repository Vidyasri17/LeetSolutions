class Solution {
    int[][][] dir = {
        {},
        {{0, -1}, {0, 1}},
        {{-1, 0}, {1, 0}},
        {{0, -1}, {1, 0}},
        {{0, 1}, {1, 0}},
        {{0, -1}, {-1, 0}},
        {{0, 1}, {-1, 0}}
    };
    public boolean hasValidPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0, 0});
        vis[0][0] = true;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];
            if(r == m - 1 && c == n - 1) return true;
            for(int[] d: dir[grid[r][c]]){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr < 0 || nc < 0 || nr >= m || nc >= n || vis[nr][nc]) continue;
                for(int[] back: dir[grid[nr][nc]]){
                    if(nr + back[0] == r && nc + back[1] == c){
                        vis[nr][nc] = true;
                        q.offer(new int[] {nr, nc});
                    }
                }
            }
        }
        return false;
    }
}