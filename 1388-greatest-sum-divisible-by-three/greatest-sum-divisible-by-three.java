class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;

        int v = Integer.MAX_VALUE, s = Integer.MAX_VALUE;

        for(int i: nums) sum += i;

        if(sum % 3 == 0) return sum;

        Arrays.sort(nums);

        if(sum % 3 == 1){
            for(int i: nums){
                if(i % 3 == 1) {
                    s = i;
                    break;
                }
            } 

            int cnt = 2, temp = 0;
            for(int i: nums) if(i % 3 == 2 && cnt > 0){
                cnt--;
                temp += i;
            }

            if(cnt == 0) v = temp;
        }

        if(sum % 3 == 2){
            for(int i: nums){
                if(i % 3 == 2){
                    s = i;
                    break;
                }
            } 

            int cnt = 2, temp = 0;
            for(int i: nums) if(i % 3 == 1 && cnt > 0){
                cnt--;
                temp += i;
            }

            if(cnt == 0) v = temp;
        }

        int remove = Math.min(v, s);

        return sum - remove;
    }
}
