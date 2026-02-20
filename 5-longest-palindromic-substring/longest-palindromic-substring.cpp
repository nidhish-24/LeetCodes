class Solution {
public:

   int strfinder(string s,int left,int right){
    while(left>=0 && right<s.length() && s[left]==s[right]){
        left--;
        right++;
    }
      return right-left-1;
}
    string longestPalindrome(string s) {
    int start=0;
    int end=0;
    
    for(int i=0;i<s.length();i++){
        
        int len=strfinder(s,i,i);
        int len1=strfinder(s,i,i+1);
        
        int maxlen=max(len,len1);
        
        if(maxlen>end-start){
            start=i-(maxlen-1)/2;
            end=i+maxlen/2;
        }
    }
    string h = "";
    h=s.substr(start, end - start + 1);
    
    
    return h;
}
    };
