class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1){
            n = sumOfSqrs(n);
            if(set.contains(n)) return false;
            set.add(n);

        }
        return true;
    }
    public int sumOfSqrs(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += (rem * rem);
            n /= 10;
        }
        return ans;
    }
}