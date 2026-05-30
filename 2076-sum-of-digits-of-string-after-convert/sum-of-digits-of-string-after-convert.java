class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int temp = ch - 'a' + 1;
            while(temp > 0){
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
        }
        k -= 1;
        while(k-- > 0){
            int temp = sum;
            sum = 0;
            while(temp > 0){
                sum += (temp % 10);
                temp /= 10;
            }
        }
        return sum;
    }
}