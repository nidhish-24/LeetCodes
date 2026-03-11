class Solution {
    public int maxSubArray(int[] nums) {
        
        // int left=0;
        // int right=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        // while(left<=right && right<nums.length && left<nums.length){
        //     sum=0;
        //     while(right<nums.length){
        //     sum+=nums[right];
        //     right++;
        //     max=Math.max(sum,max);
        //    }
        //    left++;
        //    right=left;
        // }
        // return max;


        for(int i=0;i<nums.length;i++){

            sum+=nums[i];
            
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}