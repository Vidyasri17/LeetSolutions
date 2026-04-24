class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0, r = 0, n = 0;
        for(int i = 0; i < moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'L') l++;
            else if(ch == 'R') r++;
            else n++;
        }
        return Math.abs(l - r) + n;
    }
}