class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()==0){
            return 0;
        }
        int count=0;
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){

            int[] freq=new int[256];

            count=0;

            for(int j=i;j<s.length();j++){

                if(freq[s.charAt(j)]==1){
                    break;
                }
                freq[s.charAt(j)]=1;
                count++;
            }

            if(count>maxcount){
                maxcount=count;
            }

        }
        return maxcount;
    }
}