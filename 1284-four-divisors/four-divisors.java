class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i: map.keySet()){
            sum += map.get(i) * divisorCnt(i);
        }

        return sum;
    }
    public int divisorCnt(int num){
        int cnt = 0;
        int sum = 0;

        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){
                if (i == num / i){
                    sum += i;
                    cnt++;
                }
                else{
                    cnt += 2;
                    sum += i;
                    sum += (num / i);
                }
            }
            if(cnt > 4) return 0;
        }
        if(cnt != 4) return 0;
        return sum;
    }
}