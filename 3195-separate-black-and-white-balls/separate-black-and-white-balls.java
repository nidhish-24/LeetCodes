class Solution {
    public long minimumSteps(String s) {
       long black=0;
       long steps=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                black++;
            }else{
                steps+=black;
            }
        }
        return steps;
    }
}