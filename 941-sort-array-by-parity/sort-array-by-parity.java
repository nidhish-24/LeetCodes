class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int st=0;
        int end=nums.length-1;
        if(nums.length==2 && nums[0]%2==0){
           return nums;
        }
        while(st<end){
            if(nums[st]%2==0){
                st++;
            }
            if(nums[end]%2!=0){
                end--;
            }
            else if(nums[st]%2!=0 && nums[end]%2==0){
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
                st++;
                end--;
            }
        }
        return nums;
    }
}