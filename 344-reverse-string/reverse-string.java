class Solution {
    public void reverseString(char[] c) {
        int j = c.length-1;
        for(int i=0;i<j;i++){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            j--;
        }
    }
}