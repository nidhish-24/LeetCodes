class Solution {
    public long minimumSteps(String s) {
        long black = 0;
        long steps = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                black++;      // count black balls
            } else {          // c == '0', white ball
                steps += black;  // this white ball must move past all black balls
            }
        }
        return steps;
    }
}
