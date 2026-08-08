class Solution {
    public int minimumChairs(String s) {
        int maxi = -1;
        int chairs = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'E') chairs++;
            else chairs--;
            maxi = Math.max(maxi, chairs);
        }
        return maxi;
    }
}