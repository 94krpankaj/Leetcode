class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        
        while(start<end){
            char a = s[start];
            char b = s[end];
            char c = a;
            
            a = b;
            b = c;
            
            s[start] = a;
            s[end] = b;
            start++;
            end--;
        }
    }
}