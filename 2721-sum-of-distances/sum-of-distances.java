class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
        long[] res = new long[n];
        for(List<Integer> list: map.values()){
            int size = list.size();
            long[] ps = new long[size];
            ps[0] = list.get(0);
            for(int i = 1; i < size; i++) ps[i] = ps[i - 1] + list.get(i);
            for(int i = 0; i < size; i++){
                int idx = list.get(i);
                long left = (long) idx * i - (i > 0 ? ps[i - 1] : 0);
                long right = (ps[size - 1] - ps[i]) - (long) idx * (size - i - 1); 
                res[idx] = left + right;
            }
        }
        return res;
    }
}