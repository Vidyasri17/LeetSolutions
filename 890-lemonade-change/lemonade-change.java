class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0, tens = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                fives++;
            }
            else if(bills[i] == 20){
                if(tens == 0){
                    fives -= 3;
                }
                else{
                    fives--;
                    tens--;
                }
            }
            else{
                tens++;
                fives--;
            }
            if(fives < 0 || tens < 0) return false;
        }
        return true;
    }
}