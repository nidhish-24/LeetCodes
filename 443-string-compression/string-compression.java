class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int st = 0;           // write position
        int end = 0;          // read pointer

        while (end < n) {
            char current = chars[end];
            int count = 0;

            // count how many times current char repeats
            while (end < n && chars[end] == current) {
                count++;
                end++;
            }

            // write the character at st
            chars[st++] = current;

            // write count (if > 1)
            if (count > 1) {
                String s = String.valueOf(count);
                for (char c : s.toCharArray()) {
                    chars[st++] = c;
                }
            }
        }
        return st;   // compressed length
    }
}
