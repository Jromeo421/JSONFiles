package JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author JJ Hugh
 */
public class JUnit {
    
        public static void main(String[] args) {
         Result endGame = JUnitCore.runClasses(TestAssertions.class);

         endGame.getFailures().forEach((failure) -> {
             System.out.println(failure.toString());
            });
         
         System.out.println(endGame.wasSuccessful());
         
      }
   }   
