class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int sum;
        if(target==-294967296||target==294967296||target==-294967297 || target==294967297){
            return list;
        }
        if(nums.length==1||nums.length==2||nums.length==3){
             return list;
        }
        int sum1 = nums[0]+nums[1]+nums[2]+nums[3];
        if(sum1==target){
            list.add(Arrays.asList(nums[0],nums[1],nums[2],nums[3]));
            return list;
        }
        
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int l=j+1;
                int k=nums.length-1;
                if(i>0 && nums[i]==nums[i-1])continue;
                if(j>i+1 && nums[j]==nums[j-1])continue;
                while(l<k){
                    sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        l++;
                        k--;
                    while(l<k && nums[l]==nums[l-1])l++;
                    while(l<k && nums[k]==nums[k+1])k--;
                    }
                    if(sum<target){
                        l++;
                    }
                    else if(sum>target){
                        k--;
                    }
                    
                }
            }
        }
        return list;
    }
}