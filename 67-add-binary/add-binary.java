class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int v = a.length(), s = b.length();
        int n;
        if(v > s) n = v;
        else n = s;
        char ch1 = '0', ch2 = '0', carry = '0';
        for(int i = n - 1; i >= 0; i--){
            if(v > 0) ch1 = a.charAt(--v);
            else ch1 = '0';
            if(s > 0) ch2 = b.charAt(--s);
            else ch2 = '0';
            if(ch1 == '1' && ch2 == '1'){
                if(carry == '1'){
                    sb.append('1');
                }
                else{
                    sb.append('0');
                    carry = '1';
                }
            }
            else if((ch1 == '1' && ch2 == '0') || (ch1 == '0' && ch2 == '1')){
                if(carry == '0'){
                    sb.append('1');
                }
                else{
                    sb.append('0');
                }
            }
            else{
                if(carry == '1'){
                    sb.append('1');
                    carry = '0';
                }
                else{
                    sb.append('0');
                    carry = '0';
                }
            }
            
            
        }
        if(carry == '1') sb.append(carry);
        return sb.reverse().toString();
    }
}