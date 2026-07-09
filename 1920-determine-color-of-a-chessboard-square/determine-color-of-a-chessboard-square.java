class Solution {
    public boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0) - 'a';
        int row = coordinates.charAt(1) - '0';
        if(col % 2 == 1 && row % 2 == 1) return true;
        if(col % 2 == 0 && row % 2 == 0) return true;
        return false;
    }
}