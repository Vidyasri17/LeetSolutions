class Solution {
    public int countTriples(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            for(int j = i + 1; j <= n; j++){
                double sum = Math.sqrt(i * i + j * j);
                if(isInteger(sum, n)){
                    cnt++;
                }
            }
        }
        return 2 * cnt;
    }
    public boolean isInteger(double sum, int n){
        int l = 1, h = n;
        int mid;
        while(l <= h){
            mid = l + (h - l) / 2;
            if(mid == sum) return true;
            else if(mid > sum) h = mid - 1;
            else l = mid + 1;
        }
        return false;
    }
}