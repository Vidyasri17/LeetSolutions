class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        for(char ch: s.toCharArray()){
            if(ch == '1') ones++;
        }
        s = "1" + s + "1";
        List<Character> type = new ArrayList<>();
        List<Integer> len = new ArrayList<>();
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i - 1) == s.charAt(i)){
                count++;
            }
            else{
                type.add(s.charAt(i - 1));
                len.add(count);
                count = 1;
            }
        }
        type.add(s.charAt(s.length() - 1));
        len.add(count);
        int maxGain = 0;
        for(int i = 1; i < type.size() - 1; i++){
            if(type.get(i) == '1' && type.get(i - 1) == '0' && type.get(i + 1) == '0'){
                int gain = len.get(i - 1) + len.get(i + 1);
                maxGain = Math.max(gain, maxGain);
            }
        }
        return ones+ maxGain;
    }
}