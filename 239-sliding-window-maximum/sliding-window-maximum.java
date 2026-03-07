class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    int n=nums.length;
    int res[] = new int[n-k+1];
     int index=0;

     Deque<Integer> deque = new ArrayDeque<>();

     for(int right=0;right<n;right++){

        while(!deque.isEmpty() && nums[deque.peekLast()]<nums[right]){
            deque.pollLast();
        }

        deque.addLast(right);

        if(deque.peekFirst() < right-k+1){
            deque.pollFirst();
        }

        if(right>=k-1){
            res[index++]=nums[deque.peekFirst()];
        }
     }

     return res;   
    }
}