class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int left = 0, right = 0;
        int lq = 0, rq = 0;
        for(int i = 0; i < n; i++){
            char ch = num.charAt(i);
            if(i * 2 < n){
                if(ch == '?') lq++;
                else left += (ch - '0');
            } else{
                if(ch == '?') rq++;
                else right += (ch - '0');
            }
        }
        int diff = left - right;
        int qDiff = rq - lq;
        if((lq + rq) % 2 == 1) return true;
        if(diff == qDiff * 9 / 2) return false;
        return true;
    }
}