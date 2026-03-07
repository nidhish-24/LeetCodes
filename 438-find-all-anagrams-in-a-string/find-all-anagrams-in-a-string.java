class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int right =0;
        
        int left=0;

        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<p.length();i++){
           char ch =p.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(right=0;right<s.length();right++){

            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)-1);

            if(right-left+1==p.length()){
                boolean allsame = map.values().stream().allMatch(v->v==0);

                if(allsame){
                    list.add(left);
                }
            
            char ch1=s.charAt(left);
            map.put(ch1,map.getOrDefault(ch1,0)+1);
            left++;
        }
        }

        
        return list;

     }
}