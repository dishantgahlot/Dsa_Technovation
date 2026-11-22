public class Solution {
    public boolean isPalindrome(String s) {

        

       s =  s.toLowerCase();

        String s1 = s.replaceAll("[^a-z0-9]" , "");

        String reverse = new StringBuilder(s1).reverse().toString();


        if(reverse.equals(s1)){
            return true;
        }
        else{

            return false;
        }


        
    }
} solution {
    
}
