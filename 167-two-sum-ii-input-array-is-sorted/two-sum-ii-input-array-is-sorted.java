class Solution {
    public int[] twoSum(int[] num, int target) {
        int i=0,j=num.length-1;
        int[] nums = new int[2];
        while(i<j){
            if(num[j]+num[i]==target){
                nums[0] = i+1 ;
                nums[1] = j+1;
                break;
            }
           else if(num[i]+num[j]>target){
            j--;
        }
        else{
            i++;
        }
        }
        return nums;

    }
}
