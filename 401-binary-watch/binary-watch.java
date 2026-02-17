class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> lst = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 60; j++){
                int hours = Integer.bitCount(i);
                int minutes = Integer.bitCount(j);
                if(hours + minutes == turnedOn) {
                    lst.add(i + ":" + (j < 10 ? "0" : "")+ j);
                }
            }
        }
        return lst;
    }
}