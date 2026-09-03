class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res=new StringBuilder();
        String first=strs[0];
        char[] firstChars=first.toCharArray();
        for(int i=0;i<firstChars.length;i++){
            char c=firstChars[i];
            for(int j=1;j<strs.length;j++){
                if(i >= strs[j].length() || strs[j].charAt(i)!=c){
                    return res.toString();
                }
            }
            res.append(c);
        }
        return res.toString();
    }
}