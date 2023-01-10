public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        int counter = 0;
        String binaryString = Integer.toBinaryString(n);
        int length = binaryString.length();
        while(counter < length) {
            char currentChar = binaryString.charAt(counter);
            int currentInt = currentChar - '0';
            if((currentInt^1) == 0) {
                sum++;
            }
            counter++;
            n = n>>1;
        }
        return sum;
    }
}