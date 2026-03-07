class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int right=0;
        int left=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        int cons=0;
        while(right<nums.length){
          
          
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.getOrDefault(0,0)>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
         
          cons = Math.max(cons,right-left+1);
          right++;
        }

        return cons;
    }
}