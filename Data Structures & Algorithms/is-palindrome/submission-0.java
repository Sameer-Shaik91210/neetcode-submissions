class Solution {
    public boolean isPalindrome(String s) {
       String alphaNum= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       int l=0,r=alphaNum.length()-1;
       while(l<=r){
        if(alphaNum.charAt(l)==alphaNum.charAt(r)){
            l++;
            r--;
        }else{
            return false;
        }
       }
        return true;
       
    }
}
