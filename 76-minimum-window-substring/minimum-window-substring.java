class Solution {
    public String minWindow(String s, String t) {
        
        int left=0;
        int right=0;
        int start=0;
        int minlen=Integer.MAX_VALUE;
        
        if (s.length() == 0 || t.length() == 0) return "";
        HashMap<Character , Integer> map=new HashMap<>();

        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        
        int required = t.length();

        while(right<s.length()){
        
        char r = s.charAt(right);
            if(map.containsKey(r)){
                if(map.get(r)>0){
                    required--;
                }
                map.put(r,map.get(r)-1);
            }

        while(required==0){

            if(right-left+1<minlen){
                minlen=right-left+1;
                start=left;
            }

            char l = s.charAt(left);

            if(map.containsKey(l)){
                map.put(l,map.get(l)+1);
                if(map.get(l)>0){
                    required++;
                }
            }
            left++;
        }
        right++;
        }

        return (minlen==Integer.MAX_VALUE)?"":s.substring(start,minlen+start);
    }
}