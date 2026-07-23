class Solution {
    public String getHint(String secret, String guess) {
        Map<Character, Integer> map = new HashMap<>();
        int bulls = 0, cows = 0;
        for(int i = 0; i < secret.length(); i++){
            char secretCh = secret.charAt(i);
            char guessCh = guess.charAt(i);
            if(secretCh == guessCh){
                bulls++;
            }
            else{
                map.put(guessCh, map.getOrDefault(guessCh, 0) + 1);
            }
        }
        for(int i = 0; i < secret.length(); i++){
            char secretCh = secret.charAt(i);
            char guessCh = guess.charAt(i);
            if(map.containsKey(secretCh) && map.get(secretCh) > 0 && secretCh != guessCh){
                cows++;
                map.put(secretCh, map.get(secretCh) - 1);
            }
        }
        return "" + bulls + "A" + cows + "B";
    }
}