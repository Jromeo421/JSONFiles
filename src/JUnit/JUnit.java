package JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author JJ Hugh
 */
public class JUnit {
    
        public static void main(String[] args) {
         Result endGame = JUnitCore.runClasses(TestAssertions.class);

         for(Failure failure : endGame.getFailures()) {
            System.out.println(failure.toString());
         }
         
         System.out.println(endGame.wasSuccessful());
         
      }
   }   
