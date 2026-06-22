class Solution {
    public int maxNumberOfBalloons(String text) {
        int bCnt = 0, aCnt = 0, lCnt = 0, oCnt = 0, nCnt = 0;
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch == 'b') bCnt++;
            else if(ch == 'a') aCnt++;
            else if(ch == 'l') lCnt++;
            else if(ch == 'o') oCnt++;
            else if(ch == 'n') nCnt++;
        }
        int ans = Math.min(bCnt, aCnt);
        ans = Math.min(ans, lCnt / 2);
        ans = Math.min(ans, oCnt / 2);
        ans = Math.min(ans, nCnt);
        return ans;
    }
    
}