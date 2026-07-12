class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] dup = new int[n];
        int inx = 0;
        for(int i: arr) dup[inx++] = i;
        Arrays.sort(dup);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < n; i++){
            if(!map.containsKey(dup[i])){
                map.put(dup[i], rank++);
            }
        }
        inx = 0;
        for(int i: arr){
            dup[inx++] = map.get(i);
        }
        return dup;
    }
}