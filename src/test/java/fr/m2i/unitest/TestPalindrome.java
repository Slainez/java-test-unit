
package fr.m2i.unitest;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



public class TestPalindrome {
    
    @Test
    void kayakEstUnPalindrome(){
        
        assertTrue(Palindrome.isPalindrome("kayak"));
    }
    
        @Test
    void bonjourEstUnPalindrome(){
        
        assertFalse(Palindrome.isPalindrome("bonjour"));
    }
    
    @Test
    void emptyIsNotAPalindrome(){
        
        assertTrue(Palindrome.isPalindrome(""));
        
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"kayak","ata","csc"})
    void allIsNotAPalindrome(String s){
        
        assertTrue(Palindrome.isPalindrome(s));
        
    }
    
}
