package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author JJ Hugh
 */
class TestAssertions {
    
    @Test
    public void  testAssertions(){
        
        //Define the Data within the test
        String strg1 = new String("Butter Peacan Pie");
        String strg2 = new String ("Butter Peacan Pie");
        String strg3 = null;
        String strg4 = "Oreo Reeses Ice Cream";
        String strg5 = "Oreo Reeses Ice Cream";
        
        int integer1 = 246810;
        int integer2 = 13579;
        
        String[] expectedArray = {"Grapes", "Cranberries", "Strawberries"};
        String[] resultArray = {"Grapes", "Cranberries", "Strawberries"};
        
        
       //Is the object a Null result.
       assertNull(strg3);
       
       //Are these referencing the same object.
       assertSame(strg4, strg5);
       
       //Are these not referencing the same object.
       assertNotSame(strg1,strg3);
       
       //Is this condition true.
       assertEquals(strg1, strg2);
       
       //Are these conditons met?
       assertTrue(integer1 > integer2);
       
       //Are thse conditions met?
       assertFalse(integer1 > integer2);
       
       //Is the object not a Null result?
       assertNotNull(strg1);
       
       //Are there arras equal to each other?
       assertArrayEquals(expectedArray, resultArray);
       
    }
}
