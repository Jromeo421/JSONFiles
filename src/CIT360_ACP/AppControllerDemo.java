/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT360_ACP;
import java.util.Scanner;

/**
 *
 * @author JRome
 */
public class AppControllerDemo {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What information would you like to see? USER, ACCOUNT, SALARY ");
        AppController app = new AppController();
        app.dispatchRequest(input.next());
    }
    
}
