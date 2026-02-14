class Solution {
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[] out = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    out[0] = i;
                    out[1] = j;
                    return out;
                }
            }
        }
        return new int[]{-1, -1}; // If no pair found
    }
    }
