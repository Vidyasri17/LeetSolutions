class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> curr = new HashSet<>();
        for(int i: arr){
            Set<Integer> next = new HashSet<>();
            next.add(i);
            for(int j: curr) next.add(i | j);
            curr = next;
            res.addAll(curr);
        }
        return res.size();
    }
}