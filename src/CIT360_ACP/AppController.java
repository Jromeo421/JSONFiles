/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT360_ACP;

/**
 *
 * @author JRome
 */
public class AppController {
    
    private final Dispatcher dispatcher;
    
    public AppController(){
        
       dispatcher = new Dispatcher();
    }
    
    public boolean isAuthenticUser(){
        
        System.out.println("User has been Authenticated successfully.");
        return true;
    }
    
    public void trackRequest(String request){
        
        System.out.println("Page requested " + request);
    }
    
    public void dispatchRequest(String request){
        
        trackRequest(request);
        
        if (isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    } 
}
