class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        int i = 0, j = 0;

        // Step 1: Ensure L/R order is same after removing '_'
        while (i < n || j < n) {
            // Skip blanks in start
            while (i < n && start.charAt(i) == '_') i++;

            // Skip blanks in target
            while (j < n && target.charAt(j) == '_') j++;

            // Both reached end → good
            if (i == n && j == n) return true;

            // Only one reached end → bad
            if (i == n || j == n) return false;

            // L and R must match
            if (start.charAt(i) != target.charAt(j)) return false;

            // Movement rules:
            if (start.charAt(i) == 'L' && i < j) return false; // L cannot move right
            if (start.charAt(i) == 'R' && i > j) return false; // R cannot move left

            i++;
            j++;
        }
        return true;
    }
}
