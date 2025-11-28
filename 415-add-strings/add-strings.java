import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger m = new BigInteger(num1);
        BigInteger n = new BigInteger(num2);
        BigInteger sum = m.add(n);
        return sum.toString();
    }
}