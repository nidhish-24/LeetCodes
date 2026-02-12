class Solution {
    public String removeStars(String s) {
        
        char[] ch = s.toCharArray();
         Stack<Character> st = new Stack<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='*'){
                st.pop();
            }
            else{
                st.push(ch[i]);
            }
        }
        String str= "";
        int len = st.size();
        for(int i=0;i<len;i++){
            str += st.pop();
        } 
        str = new StringBuilder(str).reverse().toString();

        return str;
    }
}