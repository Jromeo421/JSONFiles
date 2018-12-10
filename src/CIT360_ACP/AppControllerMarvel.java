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
public class AppControllerMarvel {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please type title of Marvel Movie");
        AppControllerMarvel app = new AppControllerMarvel();
        app.dispatchRequest(input.next());
    }
    
}
