class Solution {
    public boolean backspaceCompare(String s, String t) {
        char ch[] = s.toCharArray();
        char ch1[] = t.toCharArray();

        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='#' && i==0){
                continue;
            }
            else if(ch[i]=='#' &&  !st.isEmpty()){
                st.pop();
            }
            else if(ch[i]!='#'){
                st.push(ch[i]);
            }
        }
         for(int i=0;i<ch1.length;i++){
            if(ch1[i]=='#' && i==0){
                continue;
            }
            else if(ch1[i]=='#' && !st1.isEmpty()){
                st1.pop();
            }
            else if(ch1[i]!='#'){
                st1.push(ch1[i]);
            }
        }

        if(st.equals(st1)){
            return true;
        }
        return false;

    }
}