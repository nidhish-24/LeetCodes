class Solution {
    public int search(int[] arr, int target) {
        int low=0;
        int high = arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(target<arr[mid]){
                high=mid-1;
            }
            if(target>arr[mid]){
                low=mid+1;
            }
            if(target==arr[mid]){
                return mid;
            }
        }

        return -1;
    }
}