class Solution {
    public int minimumMoves(String s) {
        int moves = 0;
        int i = 0; 
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch == 'O'){
                i++;
                continue;
            }
            else{
                moves++;
                i += 3;
            }
        }
        return moves;
    }
}