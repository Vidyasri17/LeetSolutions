class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int maxi = -1, mini = 101;
        boolean[] presence = new boolean[101];
        for(int i: nums){
            maxi = Math.max(maxi, i);
            mini = Math.min(mini, i);
            presence[i] = true;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = mini; i < maxi; i++){
            if(!presence[i]) list.add(i);
        }
        return list;
    }
}