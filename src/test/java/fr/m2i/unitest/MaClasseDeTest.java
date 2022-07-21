
package fr.m2i.unitest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaClasseDeTest {
    
    @BeforeAll
    static void setupAll(){
        System.out.println("setupAll");
    }
    
     @BeforeEach
     void setup(){
        System.out.println("setup");
    }
      @AfterEach
     void teardown(){
        System.out.println("teardown");
    }
     
      @AfterAll
     static void teardownAll(){
        System.out.println("teardownAll");
    }
    
    @Test
    void unTest(){
        System.out.println("unTest");
        assertTrue(true);
    }
    
    
      @Test
    void unAutreTest(){
        System.out.println("unAutreTest");
        assertTrue(true);
    }
    
    
    
}
