class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int index = 0;
        for(int i: nums){
            if(map.containsKey(i)){
                map.get(i).add(index);
            }
            else{
                List<Integer> lst = new ArrayList<>();
                lst.add(index);
                map.put(i, lst);
            }
            index++;
        }
        int ans = Integer.MAX_VALUE;
        for(int k: map.keySet()){
            List<Integer> lst = map.get(k);
            if(lst.size() >= 3){
                for(int i = 0; i + 2 < lst.size(); i++){
                    int a = lst.get(i), b = lst.get(i + 1), c = lst.get(i + 2);
                    ans = Math.min(ans, Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a));
                }
            }
        }
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
    
}