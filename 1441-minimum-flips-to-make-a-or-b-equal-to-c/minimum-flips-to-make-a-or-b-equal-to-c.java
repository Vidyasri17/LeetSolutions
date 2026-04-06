class Solution {
    public int minFlips(int a, int b, int c) {
        int cnt = 0;
        while(a > 0 || b > 0 || c > 0){
            int A = a & 1;
            int B = b & 1;
            int C = c & 1;
            if(C == 1){
                if(A == 0 && B == 0) cnt++;
            }
            else{
                cnt += (A + B);
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return cnt;
    }
}