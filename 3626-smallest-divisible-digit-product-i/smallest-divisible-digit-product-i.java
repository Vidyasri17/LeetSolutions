class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n; i <= n + 100; i++){
            int temp = i, pro = 1;
            while(temp > 0){
                int rem = temp % 10;
                temp /= 10;
                pro *= rem;
            }
            if(pro % t == 0) return i;
        }
        return 0;
    }
}