class Solution {
    public boolean isPalindrome(String s) {
       String res="";
         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        for(char c:s.toCharArray()) {
	        	res=c+res;
	        }
	        if(s.equals(res))
	        	return true;
			return false;
    }
}
