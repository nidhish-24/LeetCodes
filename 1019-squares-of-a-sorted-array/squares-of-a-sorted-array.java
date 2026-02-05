class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = (int)Math.pow(nums[i],2);
            }
        
        int l=0;
        int r = nums.length-1;
        int p = nums.length-1;
        int res[] = new int[nums.length];

        while(l<=r){
            if(l==r){
                res[p]=nums[l];
                break;
            }
        else{
         int max= Math.max(nums[l],nums[r]);
         res[p] = max;
         p--;
         if(max==nums[r]){
            r--;
         }
         else{
            l++;
         }
         }
        }
        
       
        return res;
    }
}