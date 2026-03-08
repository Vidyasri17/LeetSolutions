class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int len = nums[0].length();
        Set<String> set = new HashSet<>();
        for(String s: nums) set.add(s);
        List<String> list = new ArrayList<>();
        generateNums(len, list, "");
        for(String s: list) if(!set.contains(s)) return s;
        return "";
    }
    public void generateNums(int n, List<String> list, String curr){
        if(curr.length() == n){
            list.add(curr);
            return;
        }

        generateNums(n, list, curr + "0");
        generateNums(n, list, curr + "1");
    }
}