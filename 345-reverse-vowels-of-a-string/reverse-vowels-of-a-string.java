class Solution {
    public String reverseVowels(String s) {
        
        int i=0;
        int j=s.length()-1;
        char ch[] = s.toCharArray();

        while(i<j){

            while(ch[i]!='A'&& ch[i]!='E' && ch[i]!='I'&& ch[i]!='O'&& ch[i]!='U'&& ch[i]!='a'&& ch[i]!='e'&&ch[i]!='u'&& ch[i]!='i'&&ch[i]!='o' && i<j)i++;
            while(ch[j]!='A'&&ch[j]!='E' && ch[j]!='I' && ch[j]!='O'&&ch[j]!='U'&&ch[j]!='a'&&ch[j]!='e'&&ch[j]!='u'&&ch[j]!='i'&& ch[j]!='o' && i<j)j--;

            if(i<j){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
            i++;
            j--;

        }
        String str="";
        for(int k=0;k<ch.length;k++){
            str += ch[k];
        }
        return str;
        
    }
}