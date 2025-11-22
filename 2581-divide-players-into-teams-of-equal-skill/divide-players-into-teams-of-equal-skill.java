class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length / 2;
        Arrays.sort(skill);
        long ans = 0;
        int sum = skill[0] + skill[2 * n - 1];
        for(int i = 0; i < n; i++){
            int a = skill[i];
            int b = skill[2 * n - i - 1];
            int temp = a + b;
            if(temp != sum){
                return -1;
            }
            else{
                ans += (a * b); 
            }
        }
        return ans;
    }
}