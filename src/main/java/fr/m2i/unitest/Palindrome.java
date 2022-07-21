
package fr.m2i.unitest;


public class Palindrome {
    
    static boolean isPalindrome(String chaine){        
        chaine = chaine.replaceAll(" ","" );
        String chaineInvert = "";        
        for (int i = chaine.length() - 1; i>= 0 ; i--){
           chaineInvert += chaine.charAt(i) ;           
        }        
        boolean palindrome = chaine.equals(chaineInvert) ;               
        return palindrome ;
    }
   
}
