/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author JRome
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
