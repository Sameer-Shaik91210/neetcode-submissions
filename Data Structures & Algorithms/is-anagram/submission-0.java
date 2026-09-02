class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())return false;
        return sort(s).equals(sort(t));

    }
    private String sort(String a){
        char[] charArray=a.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
