class Solution {
    public int maxArea(int[] height) {

     int left=0;
     int right = height.length-1;
    int max =Integer.MIN_VALUE;
     while(left<right){
         
         int l=height[left];
         int r=height[right];

         int min=Math.min(l,r);

         int water = min*(right-left);

          max=Math.max(water,max);

          if(height[left]<height[right]){
            left++;
          }
          else{
            right--;
          }

     }

     return max;   
    }
}