class Solution {
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int arr1[] = arr.clone();
        int[] out = new int[2];
        int val=0,val1=0;
        int i=0,j=n-1;
        Arrays.sort(arr);
        while(i<j){
          int sum=arr[i]+arr[j];
          if(sum==target){
            val=arr[i];
            val1=arr[j];
            break;
          }
          else if(sum>target){
            j--;
          }
          else{
            i++;
          }

        }
        int m=0;
        for(int l=0;l<arr1.length;l++){
            if(arr1[l]==val || arr1[l]==val1){
                out[m++]=l;
                if(m==2)break;
            }
        }
        return out;
    }
    }
