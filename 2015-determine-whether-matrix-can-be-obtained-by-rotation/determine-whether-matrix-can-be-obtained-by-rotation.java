class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++){
            if(isSame(mat, target)) return true;
            mat = rotate(mat);
        }
        return false;
    }
    public int[][] rotate(int[][] mat){
        int n = mat.length;
        int[][] res = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res[j][n - i - 1] = mat[i][j];
            }
        }
        return res;
    }
    public boolean isSame(int[][] m1, int[][] m2){
        int n = m1.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(m1[i][j] != m2[i][j]) return false;
            }
        }
        return true;
    }
}