class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i = num1; i <= num2; i++){
            String s = String.valueOf(i);
            int waviness = 0;
            if(s.length() >= 3){
                for(int j = 1; j < s.length() - 1; j++){
                    int a = s.charAt(j - 1) - '0';
                    int b = s.charAt(j) - '0';
                    int c = s.charAt(j + 1) - '0';
                    if(a < b && b > c) waviness++;
                    if(a > b && c > b) waviness++;
                }
            }
            ans += waviness;
        }
        return ans;
    }
}