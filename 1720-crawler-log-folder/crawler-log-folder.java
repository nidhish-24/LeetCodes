class Solution {
    public int minOperations(String[] logs) {
        
        int count =0;
        String s="../";
        String t="./";

        for(int i=0;i<logs.length;i++){
            if(logs[i].equals(s)){
                count-=1;
            }
            else if(logs[i].equals(t)){
                continue;
            }
            else if(count<0 && !logs[i].equals(s) && !logs[i].equals(t)){
                count=1;
            }
            else{
                count++;
            }
        }
        if(count<=-1){
            return 0;
        }
        return count;

    }
}